package ru.levelp.dao.note;

import org.mongodb.morphia.query.Query;
import ru.levelp.dao.BaseServiceMongo;
import ru.levelp.entities.AccessRight;
import ru.levelp.entities.Note;

import java.util.List;

public class NoteServiceMongo extends BaseServiceMongo<Note> implements NoteDAO {

    public NoteServiceMongo() {
        super(Note.class);
    }

    //Возвращает заметки для пользователя : его заметки, и заметки, которые он имеет право редакировать или просматривать
    public List<Note> getForUser(String id) {
        //Получаем заметки созданные пользователем
        List<Note> noteList = request().createQuery(Note.class)
                .field("author").equal(id)
                .asList();

        //Получаем объекты AccessRight,в которых указан данный пользователь
        List<AccessRight> accessList = request().createQuery(AccessRight.class)
                .field("userId").equal(id)
                .asList();

        //Перебираем коллекцию прав пользователя, и с помощью указанных в них номера заметки(getNoteId) получаем
        // эти заметки. Добавляем их в коллекцию noteList и возвращаем коллекцию
        for(int i=0;i<accessList.size();i++) {

            String noteId = accessList.get(i).getNoteId();
            Note note = get(noteId);
            noteList.add(note);
        }
        return noteList;
    }
}

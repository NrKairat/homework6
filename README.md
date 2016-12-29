# homework6
 1. Unit-тесты для всех методов сервисов БД.
 2. Реализации сервисов БД для MySQL Hibernate.
 3. Тестирование Hibernate сервисов.

    Для реализации работы с заметками в Монго создано 3 коллекции: notes, users, access_rights
    В коллекции access_rights хранятся объекты AccessRights с полями String id, userId, noteId, int mode
    В объектах класса Note отсуствует поле со списком прав List<AccessRights>
    
    Для реализации работы с заметками в Hibernate создано 3 таблицы: notes, users, note_rights
    В таблице note_rights хранятся объекты AccessRights с полями String id, userId, noteId, int mode
    В объектах класса Note отсуствует поле со списком прав List<AccessRights>
    Для получения списка прав пользователя используется таблица note_rights, и поиск поля "userId" в этой таблице
    Никаких связей между таблицами реализовано не было

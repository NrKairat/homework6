package ru.levelp.dao.accessRight;

import ru.levelp.dao.BaseServiceMongo;
import ru.levelp.entities.AccessRight;
import ru.levelp.entities.Note;

/**
 * Created by кайрат on 29.12.2016.
 */
public class AccessRightServiceMongo extends BaseServiceMongo<AccessRight> {
    public AccessRightServiceMongo() {
        super(AccessRight.class);
    }

}

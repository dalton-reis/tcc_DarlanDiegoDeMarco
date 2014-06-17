package br.com.furb.tagarela.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import br.com.furb.tagarela.model.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table USER.
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Email = new Property(0, String.class, "email", false, "EMAIL");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property PatientPicture = new Property(2, byte[].class, "patientPicture", false, "PATIENT_PICTURE");
        public final static Property Type = new Property(3, Integer.class, "type", false, "TYPE");
        public final static Property ServerID = new Property(4, Integer.class, "serverID", false, "SERVER_ID");
        public final static Property Id = new Property(5, Long.class, "id", true, "_id");
    };


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'USER' (" + //
                "'EMAIL' TEXT," + // 0: email
                "'NAME' TEXT," + // 1: name
                "'PATIENT_PICTURE' BLOB," + // 2: patientPicture
                "'TYPE' INTEGER," + // 3: type
                "'SERVER_ID' INTEGER," + // 4: serverID
                "'_id' INTEGER PRIMARY KEY );"); // 5: id
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'USER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(1, email);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        byte[] patientPicture = entity.getPatientPicture();
        if (patientPicture != null) {
            stmt.bindBlob(3, patientPicture);
        }
 
        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(4, type);
        }
 
        Integer serverID = entity.getServerID();
        if (serverID != null) {
            stmt.bindLong(5, serverID);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(6, id);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5);
    }    

    /** @inheritdoc */
    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // email
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getBlob(offset + 2), // patientPicture
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // type
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // serverID
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5) // id
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setEmail(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPatientPicture(cursor.isNull(offset + 2) ? null : cursor.getBlob(offset + 2));
        entity.setType(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setServerID(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setId(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}

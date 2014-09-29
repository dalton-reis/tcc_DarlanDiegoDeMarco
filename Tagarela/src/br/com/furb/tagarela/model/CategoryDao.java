package br.com.furb.tagarela.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import br.com.furb.tagarela.model.Category;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CATEGORY.
*/
public class CategoryDao extends AbstractDao<Category, Long> {

    public static final String TABLENAME = "CATEGORY";

    /**
     * Properties of entity Category.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Red = new Property(0, Integer.class, "red", false, "RED");
        public final static Property Green = new Property(1, Integer.class, "green", false, "GREEN");
        public final static Property Blue = new Property(2, Integer.class, "blue", false, "BLUE");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property ServerID = new Property(4, Integer.class, "serverID", false, "SERVER_ID");
        public final static Property Id = new Property(5, Long.class, "id", true, "_id");
    };

    private DaoSession daoSession;


    public CategoryDao(DaoConfig config) {
        super(config);
    }
    
    public CategoryDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CATEGORY' (" + //
                "'RED' INTEGER," + // 0: red
                "'GREEN' INTEGER," + // 1: green
                "'BLUE' INTEGER," + // 2: blue
                "'NAME' TEXT," + // 3: name
                "'SERVER_ID' INTEGER," + // 4: serverID
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT );"); // 5: id
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CATEGORY'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Category entity) {
        stmt.clearBindings();
 
        Integer red = entity.getRed();
        if (red != null) {
            stmt.bindLong(1, red);
        }
 
        Integer green = entity.getGreen();
        if (green != null) {
            stmt.bindLong(2, green);
        }
 
        Integer blue = entity.getBlue();
        if (blue != null) {
            stmt.bindLong(3, blue);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
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

    @Override
    protected void attachEntity(Category entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5);
    }    

    /** @inheritdoc */
    @Override
    public Category readEntity(Cursor cursor, int offset) {
        Category entity = new Category( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // red
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // green
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // blue
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // serverID
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5) // id
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Category entity, int offset) {
        entity.setRed(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setGreen(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setBlue(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setServerID(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setId(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Category entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Category entity) {
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

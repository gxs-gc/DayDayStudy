package com.yt.daydaystudy.demo_greendao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.yt.daydaystudy.demo_greendao.dao.Nv;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "NV".
*/
public class NvDao extends AbstractDao<Nv, Long> {

    public static final String TABLENAME = "NV";

    /**
     * Properties of entity Nv.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Age = new Property(1, int.class, "age", false, "AGE");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
    }


    public NvDao(DaoConfig config) {
        super(config);
    }
    
    public NvDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"NV\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"AGE\" INTEGER NOT NULL ," + // 1: age
                "\"NAME\" TEXT);"); // 2: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"NV\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Nv entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getAge());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Nv entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getAge());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Nv readEntity(Cursor cursor, int offset) {
        Nv entity = new Nv( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // age
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // name
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Nv entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAge(cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Nv entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Nv entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Nv entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

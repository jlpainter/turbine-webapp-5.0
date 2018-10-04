package org.apache.turbine.test.integrationtest.om;

import java.io.Serializable;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.BooleanKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.om.ColumnAccessByName;
import org.apache.torque.criteria.Criteria;
import org.apache.torque.util.Transaction;
import org.apache.commons.lang.ObjectUtils;


/**
 * This class was autogenerated by Torque on:
 *
 * [Thu Oct 04 13:45:56 EDT 2018]
 *
 * You should not use this class directly.  It should not even be
 * extended; all references should be to TurbineRolePermission
 */
public abstract class BaseTurbineRolePermission 
    implements Persistent, Serializable, ColumnAccessByName
{
    /** Serial version */
    private static final long serialVersionUID = 1538675156559L;



    /** Defines the roleId field. */
    private int roleId = 0;

    /** Defines the permissionId field. */
    private int permissionId = 0;

    /** Whether this object was modified after loading or after last save. */
    private boolean modified = true;

    /** 
     * Whether this object was loaded from the database or already saved 
     * (false) or whether it is not yet in the database(true).
     */
    private boolean isNew = true;

    /** Flag which indicates whether this object is currently saving. */
    private boolean saving = false;

    /** 
     * Flag which indicates whether this object is currently loaded
     * from the database. 
     */
    private boolean loading = false;

    /** 
     * Flag which indicates whether this object was deleted from the database.
     * Note that this flags does not always display the current database state,
     * there is no magical connection between this flag and the database.
     */
    private boolean deleted = false;

    /** Defines the aTurbineRole field. */
    private TurbineRole aTurbineRole = null;

    /** Defines the aTurbinePermission field. */
    private TurbinePermission aTurbinePermission = null;





    /**
     * Get the value of roleId.
     *
     * @return int
     */
    public int getRoleId() 
    {
        
        return roleId;
    }

    /**
     * Set the value of roleId.
     *
     * @param v new value
     */
    public void setRoleId(int v)
    {
        if (this.roleId != v)
        {
            setModified(true);
        }

        this.roleId = v;
        if (aTurbineRole != null && !ObjectUtils.equals(aTurbineRole.getEntityId(), v))
        {
            aTurbineRole = null;
        }


    }
    
    /**
     * Get the value of permissionId.
     *
     * @return int
     */
    public int getPermissionId() 
    {
        
        return permissionId;
    }

    /**
     * Set the value of permissionId.
     *
     * @param v new value
     */
    public void setPermissionId(int v)
    {
        if (this.permissionId != v)
        {
            setModified(true);
        }

        this.permissionId = v;
        if (aTurbinePermission != null && !ObjectUtils.equals(aTurbinePermission.getEntityId(), v))
        {
            aTurbinePermission = null;
        }


    }
    

    /**
     * Returns whether the object has ever been saved.  This will
     * be false, if the object was retrieved from storage or was created
     * and then saved.
     *
     * @return true, if the object has never been persisted.
     */
    public boolean isNew()
    {
        return isNew;
    }

    /**
     * Sets whether the object has ever been saved.
     *
     * @param isNew true if the object has never been saved, false otherwise.
     */
    public void setNew(boolean isNew)
    {
        this.isNew = isNew;
    }

    /**
     * Returns whether the object has been modified.
     *
     * @return True if the object has been modified.
     */
    public boolean isModified()
    {
        return modified;
    }

    /**
     * Sets whether the object has been modified.
     *
     * @param modified true if the object has been modified, false otherwise.
     */
    public void setModified(boolean modified)
    {
        this.modified = modified;
    }

    /**
     * Sets the modified state for the object to be false.
     */
    public void resetModified()
    {
        modified = false;
    }


    /**
     * Returns whether this object is currently saving.
     *
     * @return true if this object is currently saving, false otherwise.
     */
    public boolean isSaving()
    {
        return saving;
    }

    /**
     * Sets whether this object is currently saving.
     *
     * @param saving true if this object is currently saving, false otherwise.
     */
    public void setSaving(boolean saving)
    {
        this.saving = saving;
    }


    /**
     * Returns whether this object is currently being loaded from the database.
     *
     * @return true if this object is currently loading, false otherwise.
     */
    public boolean isLoading()
    {
        return loading;
    }

    /**
     * Sets whether this object is currently being loaded from the database.
     *
     * @param loading true if this object is currently loading, false otherwise.
     */
    public void setLoading(boolean loading)
    {
        this.loading = loading;
    }


    /**
     * Returns whether this object was deleted from the database.
     * Note that this getter does not automatically reflect database state,
     * it will be set to true by Torque if doDelete() was called with this 
     * object. Bulk deletes and deletes via primary key do not change
     * this flag. Also, if doDelete() was called on an object which does
     * not exist in the database, the deleted flag is set to true even if
     * it was not deleted.
     *
     * @return true if this object was deleted, false otherwise.
     */
    public boolean isDeleted()
    {
        return deleted;
    }

    /**
     * Sets whether this object was deleted from the database.
     *
     * @param deleted true if this object was deleted, false otherwise.
     */
    public void setDeleted(boolean deleted)
    {
        this.deleted = deleted;
    }


    /**
     * Returns the associated TurbineRole object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated TurbineRole object
     * @throws TorqueException when reading from the database fails.
     */
    public TurbineRole getTurbineRole()
        throws TorqueException
    {
        if (aTurbineRole == null && this.roleId != 0)
        {
            aTurbineRole = org.apache.turbine.test.integrationtest.om.TurbineRolePeer.retrieveByPK(SimpleKey.keyFor(this.roleId));
        }
        return aTurbineRole;
    }

    /**
     * Return the associated TurbineRole object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated TurbineRole object
     * @throws TorqueException
     */
    public TurbineRole getTurbineRole(Connection connection)
        throws TorqueException
    {
        if (aTurbineRole == null && this.roleId != 0)
        {
            aTurbineRole = org.apache.turbine.test.integrationtest.om.TurbineRolePeer.retrieveByPK(SimpleKey.keyFor(this.roleId), connection);
        }
        return aTurbineRole;
    }


    /**
     * Declares an association between this object and a TurbineRole object
     *
     * @param v TurbineRole
     */
    public void setTurbineRole(TurbineRole v)
    {
        if (v == null || v.getEntityId() == null)
        {
            setRoleId(0);
        }
        else
        {
            setRoleId(v.getEntityId());
        }
        aTurbineRole = v;
    }
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setTurbineRoleKey(ObjectKey key) throws TorqueException
    {
       
        setRoleId(((NumberKey) key).intValue());
     }

    /**
     * Returns the associated TurbinePermission object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated TurbinePermission object
     * @throws TorqueException when reading from the database fails.
     */
    public TurbinePermission getTurbinePermission()
        throws TorqueException
    {
        if (aTurbinePermission == null && this.permissionId != 0)
        {
            aTurbinePermission = org.apache.turbine.test.integrationtest.om.TurbinePermissionPeer.retrieveByPK(SimpleKey.keyFor(this.permissionId));
        }
        return aTurbinePermission;
    }

    /**
     * Return the associated TurbinePermission object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated TurbinePermission object
     * @throws TorqueException
     */
    public TurbinePermission getTurbinePermission(Connection connection)
        throws TorqueException
    {
        if (aTurbinePermission == null && this.permissionId != 0)
        {
            aTurbinePermission = org.apache.turbine.test.integrationtest.om.TurbinePermissionPeer.retrieveByPK(SimpleKey.keyFor(this.permissionId), connection);
        }
        return aTurbinePermission;
    }


    /**
     * Declares an association between this object and a TurbinePermission object
     *
     * @param v TurbinePermission
     */
    public void setTurbinePermission(TurbinePermission v)
    {
        if (v == null || v.getEntityId() == null)
        {
            setPermissionId(0);
        }
        else
        {
            setPermissionId(v.getEntityId());
        }
        aTurbinePermission = v;
    }
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setTurbinePermissionKey(ObjectKey key) throws TorqueException
    {
       
        setPermissionId(((NumberKey) key).intValue());
     }






    private static final List<String> FIELD_NAMES;

    static
    {
        List<String> fieldNames
                = new ArrayList<String>();
        fieldNames.add("RoleId");
        fieldNames.add("PermissionId");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static List<String> getFieldNames()
    {
        return FIELD_NAMES;
    }

    /**
     * Retrieves a field from the object by field (Java) name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
        if (name.equals("RoleId"))
        {
            return new Integer(getRoleId());
        }
        if (name.equals("PermissionId"))
        {
            return new Integer(getPermissionId());
        }
        return null;
    }

    /**
     * Set a field in the object by field (Java) name.
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (name.equals("RoleId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setRoleId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("PermissionId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setPermissionId(((Integer) value).intValue());
            return true;
        }
        return false;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
        if (name.equals(org.apache.turbine.test.integrationtest.om.TurbineRolePermissionPeer.ROLE_ID))
        {
            return new Integer(getRoleId());
        }
        if (name.equals(org.apache.turbine.test.integrationtest.om.TurbineRolePermissionPeer.PERMISSION_ID))
        {
            return new Integer(getPermissionId());
        }
        return null;
    }

    /**
     * Set field values by Peer Field Name
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (org.apache.turbine.test.integrationtest.om.TurbineRolePermissionPeer.ROLE_ID.getSqlExpression().equals(name))
        {
            return setByName("RoleId", value);
        }
        if (org.apache.turbine.test.integrationtest.om.TurbineRolePermissionPeer.PERMISSION_ID.getSqlExpression().equals(name))
        {
            return setByName("PermissionId", value);
        }
        return false;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
        if (pos == 0)
        {
            return new Integer(getRoleId());
        }
        if (pos == 1)
        {
            return new Integer(getPermissionId());
        }
        return null;
    }

    /**
     * Set field values by its position (zero based) in the XML schema.
     *
     * @param position The field position
     * @param value field value
     * @return True if value was set, false if not (invalid position / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPosition(int position, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (position == 0)
        {
            return setByName("RoleId", value);
        }
        if (position == 1)
        {
            return setByName("PermissionId", value);
        }
        return false;
    }



    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.
     *
     * @param toSave the object to be saved, not null.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save() throws TorqueException
    {
        save(TurbineRolePermissionPeer.DATABASE_NAME);
    }

    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.
     *
     * @param toSave the object to be saved, not null.
     * @param dbName the name of the database to which the object
     *        should be saved.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save(String dbName) 
            throws TorqueException
    {
        Connection con = null;
        try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
    }

    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally.
     *
     * @param toSave the object to be saved, not null.
     * @param con the connection to use for saving the object, not null.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save(Connection con) 
            throws TorqueException
    {
        if (isSaving())
        {
            return;
        }
        try
        {
            setSaving(true);
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    TurbineRolePermissionPeer.doInsert((TurbineRolePermission) this, con);
                    setNew(false);
                }
                else
                {
                    TurbineRolePermissionPeer.doUpdate((TurbineRolePermission) this, con);
                }
            }

        }
        finally
        {
            setSaving(false);
        }
    }





    private final SimpleKey[] pks = new SimpleKey[2];
    private final ComboKey comboPK = new ComboKey(pks);

    /**
     * Set the PrimaryKey with an ObjectKey
     *
     * @param key
     */
    public void setPrimaryKey(ObjectKey key) throws TorqueException
    {
        SimpleKey[] keys = (SimpleKey[]) key.getValue();
        setRoleId(((NumberKey) keys[0]).intValue());
        setPermissionId(((NumberKey) keys[1]).intValue());
    }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
     * @param int roleId
     * @param int permissionId
     */
    public void setPrimaryKey(int roleId, int permissionId)
        
    {
        setRoleId(roleId);
        setPermissionId(permissionId);
    }

    /**
     * Set the PrimaryKey using a String.
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
        setPrimaryKey(new ComboKey(key));
    }

    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
        SimpleKey[] pks = new SimpleKey[2];
        pks[0] = SimpleKey.keyFor(getRoleId());
        pks[1] = SimpleKey.keyFor(getPermissionId());
        return new ComboKey(pks);
    }


    /**
     * Returns an id that differentiates the referenced TurbineRole object
     * from all other TurbineRole objects.
     *
     * @return an ObjectKey.
     */
    public ObjectKey getForeignKeyForTurbineRole()
    {
        int foreignKey = getRoleId();
        if (foreignKey == 0)
        {
            return SimpleKey.keyFor((Number) null);
        }
        return SimpleKey.keyFor(foreignKey);
    }
    /**
     * Returns an id that differentiates the referenced TurbinePermission object
     * from all other TurbinePermission objects.
     *
     * @return an ObjectKey.
     */
    public ObjectKey getForeignKeyForTurbinePermission()
    {
        int foreignKey = getPermissionId();
        if (foreignKey == 0)
        {
            return SimpleKey.keyFor((Number) null);
        }
        return SimpleKey.keyFor(foreignKey);
    }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     */
    public TurbineRolePermission copy() throws TorqueException
    {
        return copy(true);
    }

    /**
     * Makes a copy of this object using a connection.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     *
     * @param con the database connection to read associated objects.
     */
    public TurbineRolePermission copy(Connection con) throws TorqueException
    {
        return copy(true, con);
    }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     */
    public TurbineRolePermission copy(boolean deepcopy) throws TorqueException
    {
        TurbineRolePermission turbineRolePermission = new TurbineRolePermission();

        return copyInto(turbineRolePermission, deepcopy);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     * @param con the database connection to read associated objects.
     */
    public TurbineRolePermission copy(boolean deepcopy, Connection con) throws TorqueException
    {
        TurbineRolePermission turbineRolePermission = new TurbineRolePermission();

        return copyInto(turbineRolePermission, deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    public TurbineRolePermission copyInto(TurbineRolePermission copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }

    /**
     * Fills the copyObj with the contents of this object using connection.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param con the database connection to read associated objects.
     */
    public TurbineRolePermission copyInto(TurbineRolePermission copyObj, Connection con) throws TorqueException
    {
        return copyInto(copyObj, true, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     */
    protected TurbineRolePermission copyInto(TurbineRolePermission copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setRoleId(0);
        copyObj.setPermissionId(0);

        if (deepcopy)
        {
        }
        return copyObj;
    }
        
    
    /**
     * Fills the copyObj with the contents of this object using connection.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     * @param con the database connection to read associated objects.
     */
    public TurbineRolePermission copyInto(TurbineRolePermission copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setRoleId(0);
        copyObj.setPermissionId(0);

        if (deepcopy)
        {
        }
        return copyObj;
    }

    /** The Peer class */
    private static final org.apache.turbine.test.integrationtest.om.TurbineRolePermissionPeer peer
            = new org.apache.turbine.test.integrationtest.om.TurbineRolePermissionPeer();

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public org.apache.turbine.test.integrationtest.om.TurbineRolePermissionPeer getPeer()
    {
        return peer;
    }

    /**
     * Retrieves the TableMap object related to this Table data without
     * compiler warnings of using getPeer().getTableMap().
     *
     * @return The associated TableMap object.
     */
    public TableMap getTableMap() throws TorqueException
    {
        return org.apache.turbine.test.integrationtest.om.TurbineRolePermissionPeer.getTableMap();
    }



    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("TurbineRolePermission:\n");
        str.append("roleId = ")
           .append(getRoleId())
           .append("\n");
        str.append("permissionId = ")
           .append(getPermissionId())
           .append("\n");
        return(str.toString());
    }

    /**
     * Compares the primary key of this instance with the key of another.
     *
     * @param toCompare The object to compare to.
     * @return Whether the primary keys are equal and the object have the
     *         same class.
     */
    public boolean equals(Object toCompare)
    {
        if (toCompare == null)
        {
            return false;
        }
        if (this == toCompare)
        {
            return true;
        }
        if (!getClass().equals(toCompare.getClass()))
        {
            return false;
        }
        TurbineRolePermission other = (TurbineRolePermission) toCompare;
        if (getPrimaryKey() == null || other.getPrimaryKey() == null)
        {
            return false;
        }
        return getPrimaryKey().equals(other.getPrimaryKey());
    }

    /**
     * If the primary key is not <code>null</code>, return the hashcode of the
     * primary key.  Otherwise calls <code>Object.hashCode()</code>.
     *
     * @return an <code>int</code> value
     */
    public int hashCode()
    {
        ObjectKey ok = getPrimaryKey();
        if (ok == null)
        {
            return super.hashCode();
        }

        return ok.hashCode();
    }



    /**
     * Compares the content of this object to another object
     *
     * @param toCompare The object to compare to.
     * @return true if all of the columns in the other object have 
     *         the same value as the objects in this class.
     */
    public boolean valueEquals(TurbineRolePermission toCompare)
    {
        if (toCompare == null)
        {
            return false;
        }
        if (this == toCompare)
        {
            return true;
        }
        if (this.roleId != toCompare.getRoleId())
        {
            return false;
        }
        if (this.permissionId != toCompare.getPermissionId())
        {
            return false;
        }
        return true;
    }



}

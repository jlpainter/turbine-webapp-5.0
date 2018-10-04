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
 * extended; all references should be to TurbineGroup
 */
public abstract class BaseTurbineGroup extends org.apache.fulcrum.security.torque.turbine.DefaultAbstractTurbineGroup
    implements Persistent, Serializable, ColumnAccessByName
{
    /** Serial version */
    private static final long serialVersionUID = 1538675156531L;



    /** Defines the entityId field. */
    private Integer entityId = null;

    /** Defines the entityName field. */
    private String entityName = null;

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



    /** Defines the collTurbineUserGroupRoles field. */
    protected List<TurbineUserGroupRole> collTurbineUserGroupRoles = null;



    /**
     * Get the value of entityId.
     *
     * @return Integer
     */
    public Integer getEntityId() 
    {
        
        return entityId;
    }

    /**
     * Set the value of entityId.
     *
     * @param v new value
     */
    public void setEntityId(Integer v)
    {
        if (!ObjectUtils.equals(this.entityId, v))
        {
            setModified(true);
        }

        this.entityId = v;

        // update associated objects in collTurbineUserGroupRoles 
        if (collTurbineUserGroupRoles != null)
        {
            for (int i = 0; i < collTurbineUserGroupRoles.size(); i++)
            {
                ((TurbineUserGroupRole) collTurbineUserGroupRoles.get(i))
                        .setGroupId(v);
            }
        }

    }
    
    /**
     * Get the value of entityName.
     *
     * @return String
     */
    public String getEntityName() 
    {
        
        return entityName;
    }

    /**
     * Set the value of entityName.
     *
     * @param v new value
     */
    public void setEntityName(String v)
    {
        if (!ObjectUtils.equals(this.entityName, v))
        {
            setModified(true);
        }

        this.entityName = v;


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
     * Initializes the cache collTurbineUserGroupRoles for referenced objects.
     * This, means, if collTurbineUserGroupRoles is null when this operation is called, it is
     * initialized with an empty collection, otherwise it remains unchanged. 
     *
     * @return the (possibly new) content of the field collTurbineUserGroupRoles, not null.
     */
    public List<TurbineUserGroupRole> initTurbineUserGroupRoles()
    {
        if (collTurbineUserGroupRoles == null)
        {
            collTurbineUserGroupRoles = new ArrayList<TurbineUserGroupRole>();
        }
        return collTurbineUserGroupRoles;
    }

    /**
     * Checks whether the cache collTurbineUserGroupRoles for referenced objects has either been
     * loaded from the database or has been manually initialized.
     */
    public boolean isTurbineUserGroupRolesInitialized()
    {
        return (collTurbineUserGroupRoles != null);
    }


    /**
     * Method called to associate a TurbineUserGroupRole object to this object
     * through the collTurbineUserGroupRoles foreign key attribute.
     * If the associated objects were not retrieved before
     * and this object is not new, the associated objects are retrieved
     * from the database before adding the <code>toAdd</code> object.
     *
     * @param toAdd the object to add to the associated objects, not null.
     *
     * @throws TorqueException if retrieval of the associated objects fails.
     * @throws NullPointerException if toAdd is null.
     */
    public void addTurbineUserGroupRole(TurbineUserGroupRole toAdd)
        throws TorqueException
    {
        toAdd.setTurbineGroup((TurbineGroup) this);
        getTurbineUserGroupRoles().add(toAdd);
    }

    /**
     * Method called to associate a TurbineUserGroupRole object to this object
     * through the collTurbineUserGroupRoles foreign key attribute using connection.
     *
     * @param l TurbineUserGroupRole
     * @throws TorqueException
     */
    public void addTurbineUserGroupRole(TurbineUserGroupRole l, Connection con) throws TorqueException
    {
        getTurbineUserGroupRoles(con).add(l);
        l.setTurbineGroup((TurbineGroup) this);
    }
    
    /**
     * The criteria used to select the current contents of collTurbineUserGroupRoles
     */
    private Criteria lastTurbineUserGroupRoleCriteria = null;

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTurbineUserGroupRoles(new Criteria())
     *
     * @return the collection of associated objects
     * @throws TorqueException
     */
    public List<TurbineUserGroupRole> getTurbineUserGroupRoles()
        throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            collTurbineUserGroupRoles = getTurbineUserGroupRoles(new Criteria());
        }
        return collTurbineUserGroupRoles;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this BaseTurbineGroup has previously
     * been saved, it will retrieve related collTurbineUserGroupRoles from storage.
     * If this BaseTurbineGroup is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List<TurbineUserGroupRole> getTurbineUserGroupRoles(Criteria criteria) throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            if (isNew())
            {
               initTurbineUserGroupRoles();
            }
            else
            {
                criteria.and(org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.GROUP_ID, getEntityId() );
                collTurbineUserGroupRoles = org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.doSelect(criteria);
            }
        }
        else
        {
            // criteria has no effect for a new object
            if (!isNew())
            {
                // the following code is to determine if a new query is
                // called for.  If the criteria is the same as the last
                // one, just return the collection.
                criteria.and(org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.GROUP_ID, getEntityId() );
                if (lastTurbineUserGroupRoleCriteria == null 
                        || !lastTurbineUserGroupRoleCriteria.equals(criteria))
                {
                    collTurbineUserGroupRoles = org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.doSelect(criteria);
                }
            }
        }
        lastTurbineUserGroupRoleCriteria = criteria;

        return collTurbineUserGroupRoles;
    }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTurbineUserGroupRoles(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List<TurbineUserGroupRole> getTurbineUserGroupRoles(Connection con) throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            collTurbineUserGroupRoles = getTurbineUserGroupRoles(new Criteria(), con);
        }
        return collTurbineUserGroupRoles;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this BaseTurbineGroup has previously
     * been saved, it will retrieve the related TurbineUserGroupRole Objects 
     * from storage.
     * If this BaseTurbineGroup is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List<TurbineUserGroupRole> getTurbineUserGroupRoles(Criteria criteria, Connection con)
            throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            if (isNew())
            {
               initTurbineUserGroupRoles();
            }
            else
            {
                criteria.and(org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.GROUP_ID, getEntityId());
                collTurbineUserGroupRoles = org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.doSelect(criteria, con);
            }
        }
        else
        {
             // criteria has no effect for a new object
            if (!isNew())
            {
                // the following code is to determine if a new query is
                // called for.  If the criteria is the same as the last
                // one, just return the collection.
                criteria.and(org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.GROUP_ID, getEntityId());
                if (!lastTurbineUserGroupRoleCriteria.equals(criteria))
                {
                    collTurbineUserGroupRoles = org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.doSelect(criteria, con);
                }
            }
        }
        lastTurbineUserGroupRoleCriteria = criteria;

        return collTurbineUserGroupRoles;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this BaseTurbineGroup is new, it will return
     * an empty collection; or if this thisObjectClassName has previously
     * been saved, it will retrieve the related objects from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can change the access modifier to public
     * by overriding this method in the child class.
     */
    protected List<TurbineUserGroupRole> getTurbineUserGroupRolesJoinTurbineGroup(Criteria criteria) throws TorqueException
    {
        return getTurbineUserGroupRolesJoinTurbineGroup(criteria, null);
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this BaseTurbineGroup is new, it will return
     * an empty collection; or if this BaseTurbineGroup has previously
     * been saved, it will retrieve the related objects from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can change the access modifier to public
     * by overriding this method in the child class.
     */
    protected List<TurbineUserGroupRole> getTurbineUserGroupRolesJoinTurbineGroup(Criteria criteria, Connection connection)
        throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            if (isNew())
            {
                initTurbineUserGroupRoles();
            }
            else
            {
                criteria.and(org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.GROUP_ID, getEntityId() );
                collTurbineUserGroupRoles = org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.doSelectJoinTurbineGroup(criteria, connection);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            criteria.and(org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.GROUP_ID, getEntityId() );
            if (!lastTurbineUserGroupRoleCriteria.equals(criteria))
            {
                collTurbineUserGroupRoles = org.apache.turbine.test.integrationtest.om.TurbineUserGroupRolePeer.doSelectJoinTurbineGroup(criteria, connection);
            }
        }
        lastTurbineUserGroupRoleCriteria = criteria;

        return collTurbineUserGroupRoles;
    }




    private static final List<String> FIELD_NAMES;

    static
    {
        List<String> fieldNames
                = new ArrayList<String>();
        fieldNames.add("EntityId");
        fieldNames.add("EntityName");
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
        if (name.equals("EntityId"))
        {
            return getEntityId();
        }
        if (name.equals("EntityName"))
        {
            return getEntityName();
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
        if (name.equals("EntityId"))
        {
            // Object fields can be null
            if (value != null && ! Integer.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setEntityId((Integer) value);
            return true;
        }
        if (name.equals("EntityName"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setEntityName((String) value);
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
        if (name.equals(org.apache.turbine.test.integrationtest.om.TurbineGroupPeer.GROUP_ID))
        {
            return getEntityId();
        }
        if (name.equals(org.apache.turbine.test.integrationtest.om.TurbineGroupPeer.GROUP_NAME))
        {
            return getEntityName();
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
        if (org.apache.turbine.test.integrationtest.om.TurbineGroupPeer.GROUP_ID.getSqlExpression().equals(name))
        {
            return setByName("EntityId", value);
        }
        if (org.apache.turbine.test.integrationtest.om.TurbineGroupPeer.GROUP_NAME.getSqlExpression().equals(name))
        {
            return setByName("EntityName", value);
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
            return getEntityId();
        }
        if (pos == 1)
        {
            return getEntityName();
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
            return setByName("EntityId", value);
        }
        if (position == 1)
        {
            return setByName("EntityName", value);
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
        save(TurbineGroupPeer.DATABASE_NAME);
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
                    TurbineGroupPeer.doInsert((TurbineGroup) this, con);
                    setNew(false);
                }
                else
                {
                    TurbineGroupPeer.doUpdate((TurbineGroup) this, con);
                }
            }

            if (isTurbineUserGroupRolesInitialized())
            {
                for (TurbineUserGroupRole collTurbineUserGroupRoles : getTurbineUserGroupRoles())
                {
                    collTurbineUserGroupRoles.save(con);
                }
            }
        }
        finally
        {
            setSaving(false);
        }
    }




    /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key entityId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
        setEntityId(Integer.valueOf(((NumberKey) key).intValue()));
    }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
        setEntityId(new Integer(key));
    }


    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
        return SimpleKey.keyFor(getEntityId());
    }



    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     */
    public TurbineGroup copy() throws TorqueException
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
    public TurbineGroup copy(Connection con) throws TorqueException
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
    public TurbineGroup copy(boolean deepcopy) throws TorqueException
    {
        TurbineGroup turbineGroup = new TurbineGroup();

        return copyInto(turbineGroup, deepcopy);
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
    public TurbineGroup copy(boolean deepcopy, Connection con) throws TorqueException
    {
        TurbineGroup turbineGroup = new TurbineGroup();

        return copyInto(turbineGroup, deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    public TurbineGroup copyInto(TurbineGroup copyObj) throws TorqueException
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
    public TurbineGroup copyInto(TurbineGroup copyObj, Connection con) throws TorqueException
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
    protected TurbineGroup copyInto(TurbineGroup copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setEntityId((Integer) null);
        copyObj.setEntityName(entityName);

        if (deepcopy)
        {
            if (collTurbineUserGroupRoles != null)
            {
                for (int i = 0; i < collTurbineUserGroupRoles.size(); i++)
                {
                    TurbineUserGroupRole obj = collTurbineUserGroupRoles.get(i);
                    copyObj.addTurbineUserGroupRole(obj.copy());
                }
            }
            else
            {
                copyObj.collTurbineUserGroupRoles = null;
            }
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
    public TurbineGroup copyInto(TurbineGroup copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setEntityId((Integer) null);
        copyObj.setEntityName(entityName);

        if (deepcopy)
        {
            for (TurbineUserGroupRole obj : getTurbineUserGroupRoles(con))
            {
                copyObj.addTurbineUserGroupRole(obj.copy());
            }
        }
        return copyObj;
    }

    /** The Peer class */
    private static final org.apache.turbine.test.integrationtest.om.TurbineGroupPeer peer
            = new org.apache.turbine.test.integrationtest.om.TurbineGroupPeer();

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public org.apache.turbine.test.integrationtest.om.TurbineGroupPeer getPeer()
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
        return org.apache.turbine.test.integrationtest.om.TurbineGroupPeer.getTableMap();
    }



    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("TurbineGroup:\n");
        str.append("entityId = ")
           .append(getEntityId())
           .append("\n");
        str.append("entityName = ")
           .append(getEntityName())
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
        TurbineGroup other = (TurbineGroup) toCompare;
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
    public boolean valueEquals(TurbineGroup toCompare)
    {
        if (toCompare == null)
        {
            return false;
        }
        if (this == toCompare)
        {
            return true;
        }
        if (!ObjectUtils.equals(this.entityId, toCompare.getEntityId()))
        {
            return false;
        }
        if (!ObjectUtils.equals(this.entityName, toCompare.getEntityName()))
        {
            return false;
        }
        return true;
    }



}

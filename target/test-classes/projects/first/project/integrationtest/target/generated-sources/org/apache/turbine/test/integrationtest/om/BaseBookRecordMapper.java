package org.apache.turbine.test.integrationtest.om;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.torque.Column;
import org.apache.torque.TorqueException;
import org.apache.torque.criteria.CriteriaInterface;
import org.apache.torque.om.mapper.RecordMapper;


/**
 * Maps ResultSet rows into Book objects.
 *
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Thu Oct 04 13:45:56 EDT 2018]
 *
 */
public class BaseBookRecordMapper implements RecordMapper<Book>
{

    /** The class log. */
    private static Log log
            = LogFactory.getLog(BaseBookRecordMapper.class);

    /**
     * Constructs the object from the current row in the resultSet.
     *
     * @param resultSet the resultSet to operate on, already pointing
     *        to the correct row. Not null.
     * @param a possible offset in the columns to be considered
     *        (if previous columns contain other objects),
     *        or 0 for no offset.
     * @param criteria The criteria which created the result set.
     *        If set, the attributes to set in the data object
     *        are determined from the select columns in the criteria;
     *        if no matching column can be found, null is returned.
     *        If not set, all of the table's columns are read from the
     *        result set in the order defined in the table definition.
     *
     * @return the mapped object, not null.
     *
     * @throws TorqueException when reading fields from the RecordSet fails
     *         or if a Criteria is passed which contains select columns other
     *         than the columns in the BOOK table.
     */
    public Book processRow(
                ResultSet resultSet,
                int offset,
                CriteriaInterface<?> criteria)
            throws TorqueException
    {
        Book book = new Book();

        try 
        {
            book.setLoading(true);
            if (criteria == null)
            {
                book.setBookId(
                        getBookId(resultSet, offset + 1));
                book.setAuthId(
                        getAuthId(resultSet, offset + 2));
                book.setTitle(
                        getTitle(resultSet, offset + 3));
                book.setSubject(
                        getSubject(resultSet, offset + 4));
            }
            else
            {
                // try to get columns to be mapped
                // from criteria's select columns
                boolean columnMapped = false;
                int totalOffset = offset + 1;
                List<Column> selectColumns = criteria.getSelectColumns();
                List<Column> columnsWithoutOffset = selectColumns.subList(
                        offset, 
                        selectColumns.size());
                for (Column column : columnsWithoutOffset)
                {
                    if (BaseBookPeer.BOOK_ID.getSqlExpression().equals(
                            column.getSqlExpression()))
                    {
                        book.setBookId(
                            getBookId(resultSet, totalOffset));
                        columnMapped = true;
                    }
                    else if (BaseBookPeer.AUTH_ID.getSqlExpression().equals(
                            column.getSqlExpression()))
                    {
                        book.setAuthId(
                            getAuthId(resultSet, totalOffset));
                        columnMapped = true;
                    }
                    else if (BaseBookPeer.TITLE.getSqlExpression().equals(
                            column.getSqlExpression()))
                    {
                        book.setTitle(
                            getTitle(resultSet, totalOffset));
                        columnMapped = true;
                    }
                    else if (BaseBookPeer.SUBJECT.getSqlExpression().equals(
                            column.getSqlExpression()))
                    {
                        book.setSubject(
                            getSubject(resultSet, totalOffset));
                        columnMapped = true;
                    }
                    totalOffset++;
                }
                if (!columnMapped)
                {
                    log.debug("no columns to map found in criteria, "
                        + "returning null");
                    return null;
                }
            }
            book.setNew(false);
            book.setModified(false);
        }
        finally
        {
            book.setLoading(false);
        }
        return book;
    }

        /**
         * Reads the value of the <code>columnIndex</code>'th column
         * in the <code>resultSet</code> so that it can be used to set
         * the field bookId in Book.
         *
         * @param dbObject the database object to fill, not null.
         * @param resultSet the ResultSet to read from, not null.
         * @param columnIndex the index in the resultSet which should be read.
         *
         * @return the content of the column.
         *
         * @throws SQLException if a problem occurs when reading
         *         from the resultSet.
         */
        protected int getBookId(
                    ResultSet resultSet,
                    int columnIndex)
                throws TorqueException
        {
            try
            {
                return resultSet.getInt(columnIndex);
            }
            catch (SQLException e)
            {
                throw new TorqueException(e);
            }
        }

        /**
         * Reads the value of the <code>columnIndex</code>'th column
         * in the <code>resultSet</code> so that it can be used to set
         * the field authId in Book.
         *
         * @param dbObject the database object to fill, not null.
         * @param resultSet the ResultSet to read from, not null.
         * @param columnIndex the index in the resultSet which should be read.
         *
         * @return the content of the column.
         *
         * @throws SQLException if a problem occurs when reading
         *         from the resultSet.
         */
        protected int getAuthId(
                    ResultSet resultSet,
                    int columnIndex)
                throws TorqueException
        {
            try
            {
                return resultSet.getInt(columnIndex);
            }
            catch (SQLException e)
            {
                throw new TorqueException(e);
            }
        }

        /**
         * Reads the value of the <code>columnIndex</code>'th column
         * in the <code>resultSet</code> so that it can be used to set
         * the field title in Book.
         *
         * @param dbObject the database object to fill, not null.
         * @param resultSet the ResultSet to read from, not null.
         * @param columnIndex the index in the resultSet which should be read.
         *
         * @return the content of the column.
         *
         * @throws SQLException if a problem occurs when reading
         *         from the resultSet.
         */
        protected String getTitle(
                    ResultSet resultSet,
                    int columnIndex)
                throws TorqueException
        {
            try
            {
                return resultSet.getString(columnIndex);
            }
            catch (SQLException e)
            {
                throw new TorqueException(e);
            }
        }

        /**
         * Reads the value of the <code>columnIndex</code>'th column
         * in the <code>resultSet</code> so that it can be used to set
         * the field subject in Book.
         *
         * @param dbObject the database object to fill, not null.
         * @param resultSet the ResultSet to read from, not null.
         * @param columnIndex the index in the resultSet which should be read.
         *
         * @return the content of the column.
         *
         * @throws SQLException if a problem occurs when reading
         *         from the resultSet.
         */
        protected String getSubject(
                    ResultSet resultSet,
                    int columnIndex)
                throws TorqueException
        {
            try
            {
                return resultSet.getString(columnIndex);
            }
            catch (SQLException e)
            {
                throw new TorqueException(e);
            }
        }


}

/*
 * The Kuali Financial System, a comprehensive financial management system for higher education.
 * 
 * Copyright 2005-2014 The Kuali Foundation
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.kuali.kfs.coa.businessobject;

import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OrganizationReversionDetail {
	private static Logger LOG = Logger.getLogger(OrganizationReversionDetail.class.getName());
    private Integer universityFiscalYear;
    private String chartOfAccountsCode;
    private String organizationCode;
    private String organizationReversionCategoryCode;
    private String organizationReversionCode;
    private String organizationReversionObjectCode;
    private boolean active = true;

    private ObjectCode organizationReversionObject;
    private Organization organization;
    private Chart chartOfAccounts;
    private OrganizationReversionCategory organizationReversionCategory;
    private OrganizationReversion organizationReversion;

    public OrganizationReversionDetail(){
    	LOG.log(Level.INFO, "An object of class "+getClass().getName()+" has been instantiated");
        
    }
    /**
     * Gets the universityFiscalYear attribute.
     * 
     * @return Returns the universityFiscalYear
     */
    public Integer getUniversityFiscalYear() {
        return universityFiscalYear;
    }

    /**
     * Sets the universityFiscalYear attribute.
     * 
     * @param universityFiscalYear The universityFiscalYear to set.
     */
    public void setUniversityFiscalYear(Integer universityFiscalYear) {
        this.universityFiscalYear = universityFiscalYear;
    }


    /**
     * Gets the chartOfAccountsCode attribute.
     * 
     * @return Returns the chartOfAccountsCode
     */
    public String getChartOfAccountsCode() {
        return chartOfAccountsCode;
    }

    /**
     * Sets the chartOfAccountsCode attribute.
     * 
     * @param chartOfAccountsCode The chartOfAccountsCode to set.
     */
    public void setChartOfAccountsCode(String chartOfAccountsCode) {
        this.chartOfAccountsCode = chartOfAccountsCode;
    }


    /**
     * Gets the organizationCode attribute.
     * 
     * @return Returns the organizationCode
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the organizationCode attribute.
     * 
     * @param organizationCode The organizationCode to set.
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }


    /**
     * Gets the organizationReversionCategoryCode attribute.
     * 
     * @return Returns the organizationReversionCategoryCode
     */
    public String getOrganizationReversionCategoryCode() {
        return organizationReversionCategoryCode;
    }

    /**
     * Sets the organizationReversionCategoryCode attribute.
     * 
     * @param organizationReversionCategoryCode The organizationReversionCategoryCode to set.
     */
    public void setOrganizationReversionCategoryCode(String organizationReversionCategoryCode) {
        this.organizationReversionCategoryCode = organizationReversionCategoryCode;
    }

    /**
     * Gets the organizationReversionCode attribute.
     * 
     * @return Returns the organizationReversionCode
     */
    public String getOrganizationReversionCode() {
        return organizationReversionCode;
    }

    /**
     * Sets the organizationReversionCode attribute.
     * 
     * @param organizationReversionCode The organizationReversionCode to set.
     */
    public void setOrganizationReversionCode(String organizationReversionCode) {
        this.organizationReversionCode = organizationReversionCode;
    }


    /**
     * Gets the organizationReversionObjectCode attribute.
     * 
     * @return Returns the organizationReversionObjectCode
     */
    public String getOrganizationReversionObjectCode() {
        return organizationReversionObjectCode;
    }

    /**
     * Sets the organizationReversionObjectCode attribute.
     * 
     * @param organizationReversionObjectCode The organizationReversionObjectCode to set.
     */
    public void setOrganizationReversionObjectCode(String organizationReversionObjectCode) {
        this.organizationReversionObjectCode = organizationReversionObjectCode;
    }


    /**
     * Gets the organizationReversionObject attribute.
     * 
     * @return Returns the organizationReversionObject
     */
    public ObjectCode getOrganizationReversionObject() {
        return organizationReversionObject;
    }

    /**
     * Sets the organizationReversionObject attribute.
     * 
     * @param organizationReversionObject The organizationReversionObject to set.
     * @deprecated
     */
    public void setOrganizationReversionObject(ObjectCode organizationReversionObject) {
        this.organizationReversionObject = organizationReversionObject;
    }

    /**
     * Gets the organization attribute.
     * 
     * @return Returns the organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the organization attribute.
     * 
     * @param organization The organization to set.
     * @deprecated
     */
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * Gets the chartOfAccounts attribute.
     * 
     * @return Returns the chartOfAccounts
     */
    public Chart getChartOfAccounts() {
        return chartOfAccounts;
    }

    /**
     * Sets the chartOfAccounts attribute.
     * 
     * @param chartOfAccounts The chartOfAccounts to set.
     * @deprecated
     */
    public void setChartOfAccounts(Chart chartOfAccounts) {
        this.chartOfAccounts = chartOfAccounts;
    }

    /**
     * Gets the organizationReversionCategory attribute.
     * 
     * @return Returns the organizationReversionCategory.
     */
    public OrganizationReversionCategory getOrganizationReversionCategory() {
        return organizationReversionCategory;
    }

    /**
     * Sets the organizationReversionCategory attribute value.
     * 
     * @param organizationReversionCategory The organizationReversionCategory to set.
     */
    public void setOrganizationReversionCategory(OrganizationReversionCategory organizationReversionCategory) {
        this.organizationReversionCategory = organizationReversionCategory;
    }
    
    /**
     * Gets the organizationReversion attribute.
     * 
     * @return Returns the organizationReversion.
     */
    public OrganizationReversion getOrganizationReversion() {
        return organizationReversion;
    }

    /**
     * Sets the organizationReversion attribute value.
     * 
     * @param organizationReversion The organizationReversion to set.
     */
    public void setOrganizationReversion(OrganizationReversion organizationReversion) {
        this.organizationReversion = organizationReversion;
    }

    /**
     * Gets the active attribute. 
     * @return Returns the active.
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the active attribute value.
     * @param active The active to set.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    protected LinkedHashMap toStringMapper_RICE20_REFACTORME() {
        LinkedHashMap m = new LinkedHashMap();
        return m;
    }
}

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
import src.main.java.org.kuali.kfs.sys.context.SpringContext;
import src.main.java.org.kuali.kfs.gl.businessobject.SufficientFundRebuild;

public class ObjectLevel {
    Logger LOG = Logger.getLogger({your class name}.class.getName());
    private String chartOfAccountsCode;
    private String financialObjectLevelCode;
    private String financialObjectLevelName;
    private String financialObjectLevelShortNm;
    private boolean active;
    private String financialReportingSortCode;
    private String financialConsolidationObjectCode;

    private ObjectConsolidation financialConsolidationObject = new ObjectConsolidation();
    private Chart chartOfAccounts;

    

    /**
     * Gets the financialObjectLevelCode attribute.
     * 
     * @return Returns the financialObjectLevelCode
     */
    public String getFinancialObjectLevelCode() {
        return financialObjectLevelCode;
    }

    /**
     * Sets the financialObjectLevelCode attribute.
     * 
     * @param financialObjectLevelCode The financialObjectLevelCode to set.
     */
    public void setFinancialObjectLevelCode(String financialObjectLevelCode) {
        this.financialObjectLevelCode = financialObjectLevelCode;
    }

    /**
     * Gets the financialObjectLevelName attribute.
     * 
     * @return Returns the financialObjectLevelName
     */
    public String getFinancialObjectLevelName() {
        return financialObjectLevelName;
    }

    /**
     * Sets the financialObjectLevelName attribute.
     * 
     * @param financialObjectLevelName The financialObjectLevelName to set.
     */
    public void setFinancialObjectLevelName(String financialObjectLevelName) {
        this.financialObjectLevelName = financialObjectLevelName;
    }

    /**
     * Gets the financialObjectLevelShortNm attribute.
     * 
     * @return Returns the financialObjectLevelShortNm
     */
    public String getFinancialObjectLevelShortNm() {
        return financialObjectLevelShortNm;
    }

    /**
     * Sets the financialObjectLevelShortNm attribute.
     * 
     * @param financialObjectLevelShortNm The financialObjectLevelShortNm to set.
     */
    public void setFinancialObjectLevelShortNm(String financialObjectLevelShortNm) {
        this.financialObjectLevelShortNm = financialObjectLevelShortNm;
    }

    /**
     * Gets the financialObjectLevelActiveIndicator attribute.
     * 
     * @return Returns the financialObjectLevelActiveIndicator
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the financialObjectLevelActiveIndicator attribute.
     * 
     * @param financialObjectLevelActiveIndicator The financialObjectLevelActiveIndicator to set.
     */
    public void setActive(boolean financialObjectLevelActiveIndicator) {
        this.active = financialObjectLevelActiveIndicator;
    }

    /**
     * Gets the financialReportingSortCode attribute.
     * 
     * @return Returns the financialReportingSortCode
     */
    public String getFinancialReportingSortCode() {
        return financialReportingSortCode;
    }

    /**
     * Sets the financialReportingSortCode attribute.
     * 
     * @param financialReportingSortCode The financialReportingSortCode to set.
     */
    public void setFinancialReportingSortCode(String financialReportingSortCode) {
        this.financialReportingSortCode = financialReportingSortCode;
    }


    public String getConsolidatedObjectCode() {
        return financialConsolidationObject.getFinancialReportingSortCode();
    }

    /**
     * Gets the financialConsolidationObject attribute.
     * 
     * @return Returns the financialConsolidationObject
     */
    public ObjectConsolidation getFinancialConsolidationObject() {
        return financialConsolidationObject;
    }

    /**
     * Sets the financialConsolidationObject attribute.
     * 
     * @param financialConsolidationObject The financialConsolidationObject to set.
     */
    public void setFinancialConsolidationObject(ObjectConsolidation financialConsolidationObject) {
        this.financialConsolidationObject = financialConsolidationObject;
    }

    public String getChartOfAccountsCode() {
        return chartOfAccountsCode;
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
     * @return Returns the financialConsolidationObjectCode.
     */
    public String getFinancialConsolidationObjectCode() {
        return financialConsolidationObjectCode;
    }

    /**
     * @param financialConsolidationObjectCode The financialConsolidationObjectCode to set.
     */
    public void setFinancialConsolidationObjectCode(String financialConsolidationObjectCode) {
        this.financialConsolidationObjectCode = financialConsolidationObjectCode;
    }

    public void setChartOfAccountsCode(String chart) {
        this.chartOfAccountsCode = chart;
    }

}

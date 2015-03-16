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

public class ObjectCode {
    protected Integer universityFiscalYear;
    protected String chartOfAccountsCode;
    protected String financialObjectCode;
    protected String financialObjectCodeName;
    protected String financialObjectCodeShortName;
    protected String historicalFinancialObjectCode;
    protected boolean active;
    protected String financialObjectLevelCode;
    protected String reportsToChartOfAccountsCode;
    protected String reportsToFinancialObjectCode;
    protected String financialObjectTypeCode;
    protected String financialObjectSubTypeCode;
    protected String financialBudgetAggregationCd;
    protected String nextYearFinancialObjectCode;
    protected String finObjMandatoryTrnfrelimCd;
    protected String financialFederalFundedCode;

    protected ObjectLevel financialObjectLevel = new ObjectLevel();
    protected Chart chartOfAccounts;
    protected Chart reportsToChartOfAccounts;
    protected ObjectCode reportsToFinancialObject;

    /**
     * Constructs a ObjectCode.java with the given defaults; this way, it is not necessary to use any deprecated setters.
     * 
     * @param fiscalYear
     * @param chart
     * @param financialObjectCode - an active object code
     */
    public ObjectCode(Integer fiscalYear, String chart, String financialObjectCode) {
        this.universityFiscalYear = fiscalYear;
        this.chartOfAccountsCode = chart;
        this.financialObjectCode = financialObjectCode;
        this.active = true;
    }

    /**
     * This method is only for use by the framework
     */
    public void setUniversityFiscalYear(Integer i) {
        this.universityFiscalYear = i;
    }

    /**
     * Gets the financialObjectCode attribute.
     * 
     * @return Returns the financialObjectCode
     */
    public String getFinancialObjectCode() {
        return financialObjectCode;
    }

    /**
     * Sets the financialObjectCode attribute.
     * 
     * @param financialObjectCode The financialObjectCode to set.
     */
    public void setFinancialObjectCode(String financialObjectCode) {
        this.financialObjectCode = financialObjectCode;
    }

    /**
     * Gets the financialObjectCodeName attribute.
     * 
     * @return Returns the financialObjectCodeName
     */
    public String getFinancialObjectCodeName() {
        return financialObjectCodeName;
    }

    /**
     * Sets the financialObjectCodeName attribute.
     * 
     * @param financialObjectCodeName The financialObjectCodeName to set.
     */
    public void setFinancialObjectCodeName(String financialObjectCodeName) {
        this.financialObjectCodeName = financialObjectCodeName;
    }

    /**
     * Gets the financialObjectCodeShortName attribute.
     * 
     * @return Returns the financialObjectCodeShortName
     */
    public String getFinancialObjectCodeShortName() {
        return financialObjectCodeShortName;
    }

    /**
     * Sets the financialObjectCodeShortName attribute.
     * 
     * @param financialObjectCodeShortName The financialObjectCodeShortName to set.
     */
    public void setFinancialObjectCodeShortName(String financialObjectCodeShortName) {
        this.financialObjectCodeShortName = financialObjectCodeShortName;
    }

    /**
     * Gets the historicalFinancialObjectCode attribute.
     * 
     * @return Returns the historicalFinancialObjectCode
     */
    public String getHistoricalFinancialObjectCode() {
        return historicalFinancialObjectCode;
    }

    /**
     * Sets the historicalFinancialObjectCode attribute.
     * 
     * @param historicalFinancialObjectCode The historicalFinancialObjectCode to set.
     */
    public void setHistoricalFinancialObjectCode(String historicalFinancialObjectCode) {
        this.historicalFinancialObjectCode = historicalFinancialObjectCode;
    }

    /**
     * Gets the financialObjectActiveCode attribute.
     * 
     * @return Returns the financialObjectActiveCode
     */
    public boolean isFinancialObjectActiveCode() {
        return active;
    }

    /**
     * Sets the financialObjectActiveCode attribute.
     * 
     * @param active The financialObjectActiveCode to set.
     */
    public void setFinancialObjectActiveCode(boolean active) {
        this.active = active;
    }

    /**
     * Gets the financialObjectLevel attribute.
     * 
     * @return Returns the financialObjectLevel
     */
    public ObjectLevel getFinancialObjectLevel() {
        return financialObjectLevel;
    }

    /**
     * Sets the financialObjectLevel attribute.
     * 
     * @param financialObjectLevel The financialObjectLevel to set.
     * @deprecated
     */
    public void setFinancialObjectLevel(ObjectLevel financialObjectLevel) {
        this.financialObjectLevel = financialObjectLevel;
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
     * Gets the reportsToChartOfAccounts attribute.
     * 
     * @return Returns the reportsToChartOfAccounts
     */
    public Chart getReportsToChartOfAccounts() {
        return reportsToChartOfAccounts;
    }

    /**
     * Sets the reportsToChartOfAccounts attribute.
     * 
     * @param reportsToChartOfAccounts The reportsToChartOfAccounts to set.
     * @deprecated
     */
    public void setReportsToChartOfAccounts(Chart reportsToChartOfAccounts) {
        this.reportsToChartOfAccounts = reportsToChartOfAccounts;
    }

    /**
     * Gets the reportsToFinancialObject attribute.
     * 
     * @return Returns the reportsToFinancialObject
     */
    public ObjectCode getReportsToFinancialObject() {
        return reportsToFinancialObject;
    }

    /**
     * Sets the reportsToFinancialObject attribute.
     * 
     * @param reportsToFinancialObject The reportsToFinancialObject to set.
     * @deprecated
     */
    public void setReportsToFinancialObject(ObjectCode reportsToFinancialObject) {
        this.reportsToFinancialObject = reportsToFinancialObject;
    }

    /**
     */
    public void setChartOfAccountsCode(String string) {
        this.chartOfAccountsCode = string;
    }

    /**
     * 
     */
    public String getChartOfAccountsCode() {
        return this.chartOfAccountsCode;
    }

    /**
     * 
     */
    public Integer getUniversityFiscalYear() {
        return this.universityFiscalYear;
    }

    /**
     * @return Returns the financialBudgetAggregationCd.
     */
    public String getFinancialBudgetAggregationCd() {
        return financialBudgetAggregationCd;
    }

    /**
     * @param financialBudgetAggregationCd The financialBudgetAggregationCd to set.
     */
    public void setFinancialBudgetAggregationCd(String financialBudgetAggregationCd) {
        this.financialBudgetAggregationCd = financialBudgetAggregationCd;
    }

    /**
     * @return Returns the financialObjectLevelCode.
     */
    public String getFinancialObjectLevelCode() {
        return financialObjectLevelCode;
    }

    /**
     * @param financialObjectLevelCode The financialObjectLevelCode to set.
     */
    public void setFinancialObjectLevelCode(String financialObjectLevelCode) {
        this.financialObjectLevelCode = financialObjectLevelCode;
    }

    /**
     * @return Returns the financialObjectSubTypeCode.
     */
    public String getFinancialObjectSubTypeCode() {
        return financialObjectSubTypeCode;
    }

    /**
     * @param financialObjectSubTypeCode The financialObjectSubTypeCode to set.
     */
    public void setFinancialObjectSubTypeCode(String financialObjectSubTypeCode) {
        this.financialObjectSubTypeCode = financialObjectSubTypeCode;
    }

    /**
     * @return Returns the financialObjectTypeCode.
     */
    public String getFinancialObjectTypeCode() {
        return financialObjectTypeCode;
    }

    /**
     * @param financialObjectTypeCode The financialObjectTypeCode to set.
     */
    public void setFinancialObjectTypeCode(String financialObjectTypeCode) {
        this.financialObjectTypeCode = financialObjectTypeCode;
    }

    /**
     * @return Returns the nextYearFinancialObjectCode.
     */
    public String getNextYearFinancialObjectCode() {
        return nextYearFinancialObjectCode;
    }

    /**
     * @param nextYearFinancialObjectCode The nextYearFinancialObjectCode to set.
     */
    public void setNextYearFinancialObjectCode(String nextYearFinancialObjectCode) {
        this.nextYearFinancialObjectCode = nextYearFinancialObjectCode;
    }

    /**
     * @return Returns the reportsToChartOfAccountsCode.
     */
    public String getReportsToChartOfAccountsCode() {
        return reportsToChartOfAccountsCode;
    }

    /**
     * @param reportsToChartOfAccountsCode The reportsToChartOfAccountsCode to set.
     */
    public void setReportsToChartOfAccountsCode(String reportsToChartOfAccountsCode) {
        this.reportsToChartOfAccountsCode = reportsToChartOfAccountsCode;
    }

    /**
     * @return Returns the reportsToFinancialObjectCode.
     */
    public String getReportsToFinancialObjectCode() {
        return reportsToFinancialObjectCode;
    }

    /**
     * @param reportsToFinancialObjectCode The reportsToFinancialObjectCode to set.
     */
    public void setReportsToFinancialObjectCode(String reportsToFinancialObjectCode) {
        this.reportsToFinancialObjectCode = reportsToFinancialObjectCode;
    }

    /**
     * @return Returns the financialFederalFundedCode.
     */
    public String getFinancialFederalFundedCode() {
        return financialFederalFundedCode;
    }

    /**
     * @param financialFederalFundedCode The financialFederalFundedCode to set.
     */
    public void setFinancialFederalFundedCode(String financialFederalFundedCode) {
        this.financialFederalFundedCode = financialFederalFundedCode;
    }

    /**
     * @return Returns the finObjMandatoryTrnfrelimCd.
     */
    public String getFinObjMandatoryTrnfrelimCd() {
        return finObjMandatoryTrnfrelimCd;
    }

    /**
     * @param finObjMandatoryTrnfrelimCd The finObjMandatoryTrnfrelimCd to set.
     */
    public void setFinObjMandatoryTrnfrelimCd(String finObjMandatoryTrnfrelimCd) {
        this.finObjMandatoryTrnfrelimCd = finObjMandatoryTrnfrelimCd;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean a) {
        this.active = a;
    }

    public void setCode(String code) {
        this.chartOfAccountsCode = code;
    }

    public void setName(String name) {
        this.financialObjectCodeName = name;
    }

    public String getCode() {
        return this.financialObjectCode;
    }

    public String getName() {
        return this.financialObjectCodeName;
    }
}

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

import java.math.BigDecimal;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Merge conflicts are fun!
 */
public class AccountDelegate {
	private static Logger LOG = Logger.getLogger(AccountDelegate.class.getName());
	
    private String chartOfAccountsCode;
    private String accountNumber;
    private String financialDocumentTypeCode;
    private String accountDelegateSystemId;
    private BigDecimal finDocApprovalFromThisAmt;
    private boolean accountsDelegatePrmrtIndicator;
    private boolean active;
    private Date accountDelegateStartDate;

    private Chart chart;
    private Account account;
    
    /**
     * Default constructor.
     */
    public AccountDelegate() {
    	LOG.log(Level.INFO, "An object of class "+getClass().getName()+" has been instantiated");
    }

    /**
     * Gets the accountNumber attribute.
     *
     * @return Returns the accountNumber.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the accountNumber attribute value.
     *
     * @param accountNumber The accountNumber to set.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the chartOfAccountsCode attribute.
     *
     * @return Returns the chartOfAccountsCode.
     */
    public String getChartOfAccountsCode() {
        return chartOfAccountsCode;
    }

    /**
     * Sets the chartOfAccountsCode attribute value.
     *
     * @param chartOfAccountsCode The chartOfAccountsCode to set.
     */
    public void setChartOfAccountsCode(String chartOfAccountsCode) {
        this.chartOfAccountsCode = chartOfAccountsCode;
    }

    /**
     * Gets the financialDocumentTypeCode attribute.
     *
     * @return Returns the financialDocumentTypeCode
     */
    public String getFinancialDocumentTypeCode() {
        return financialDocumentTypeCode;
    }

    /**
     * Sets the financialDocumentTypeCode attribute.
     *
     * @param financialDocumentTypeCode The financialDocumentTypeCode to set.
     */
    public void setFinancialDocumentTypeCode(String financialDocumentTypeCode) {
        this.financialDocumentTypeCode = financialDocumentTypeCode;
    }

    /**
     * Gets the accountDelegateSystemId attribute.
     *
     * @return Returns the accountDelegateSystemId.
     */
    public String getAccountDelegateSystemId() {
        return accountDelegateSystemId;
    }

    /**
     * Sets the accountDelegateSystemId attribute value.
     *
     * @param accountDelegateSystemId The accountDelegateSystemId to set.
     */
    public void setAccountDelegateSystemId(String accountDelegateSystemId) {
        this.accountDelegateSystemId = accountDelegateSystemId;
    }

    /**
     * Gets the finDocApprovalFromThisAmt attribute.
     *
     * @return Returns the finDocApprovalFromThisAmt
     */
    public BigDecimal getFinDocApprovalFromThisAmt() {
        return finDocApprovalFromThisAmt;
    }

    /**
     * Sets the finDocApprovalFromThisAmt attribute.
     *
     * @param finDocApprovalFromThisAmt The finDocApprovalFromThisAmt to set.
     */
    public void setFinDocApprovalFromThisAmt(BigDecimal finDocApprovalFromThisAmt) {
        this.finDocApprovalFromThisAmt = finDocApprovalFromThisAmt;
    }

    /**
     * Gets the accountsDelegatePrmrtIndicator attribute.
     *
     * @return Returns the accountsDelegatePrmrtIndicator
     */
    public boolean isAccountsDelegatePrmrtIndicator() {
        return accountsDelegatePrmrtIndicator;
    }

    /**
     * Sets the accountsDelegatePrmrtIndicator attribute.
     *
     * @param accountsDelegatePrmrtIndicator The accountsDelegatePrmrtIndicator to set.
     * @deprecated
     */
    public void setAccountsDelegatePrmrtIndicator(boolean accountsDelegatePrmrtIndicator) {
        this.accountsDelegatePrmrtIndicator = accountsDelegatePrmrtIndicator;
    }

    /**
     * Gets the active attribute.
     *
     * @return Returns the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the active attribute.
     *
     * @param active The active to set.
     * @deprecated
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Gets the accountDelegateStartDate attribute.
     *
     * @return Returns the accountDelegateStartDate
     */
    public Date getAccountDelegateStartDate() {
        return accountDelegateStartDate;
    }

    /**
     * Sets the accountDelegateStartDate attribute.
     *
     * @param accountDelegateStartDate The accountDelegateStartDate to set.
     */
    public void setAccountDelegateStartDate(Date accountDelegateStartDate) {
        this.accountDelegateStartDate = accountDelegateStartDate;
    }
    /**
     * Gets the account attribute.
     *
     * @return Returns the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the account attribute.
     *
     * @param account The account to set.
     * @deprecated
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * This method (a hack by any other name...) returns a string so that an Account Delegate can have a link to view its own
     * inquiry page after a look up
     *
     * @return the String "View Account Delegate"
     */
    public String getAccountDelegateViewer() {
        return "View Account Delegate";
    }

    /**
     * Gets the chart attribute.
     *
     * @return Returns the chart.
     */
    public Chart getChart() {
        return chart;
    }

    /**
     * Sets the chart attribute value.
     *
     * @param chart The chart to set.
     */
    public void setChart(Chart chart) {
        this.chart = chart;
    }
}


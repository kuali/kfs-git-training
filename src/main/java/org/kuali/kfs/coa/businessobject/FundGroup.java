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


/**
 * Fund Group Business Object
 */
public class FundGroup {
    private static final long serialVersionUID = 6940405128416948259L;
    protected String code;
    protected String name;
    protected boolean active = true;
    private String financialReportingSortCode;
    private String fundGroupBudgetAdjustmentRestrictionLevelCode;

    /**
     * @return Getter for the Code.
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code - Setter for the Code.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return Getter for the Name.
     */
    public String getName() {
        return name;
    }


    /**
     * @param name - Setter for the name.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return Getter for the active field.
     */
    public boolean isActive() {
        return active;
    }


    /**
     * @param a - Setter for the active field.
     */
    public void setActive(boolean a) {
        this.active = a;
    }

    /**
     * Static helper method to allow other classes to provide consistent "code and description"
     * behavior, even if not extending from this class.
     */
    public static String getCodeAndDescription(String code, String desc) {
        if (code != null) {
            if (desc == null) {
                return code;
            } else {
                return code + " - " + desc;
            }
        }
        return "";
    }

    /**
     * This method...
     * 
     * @return
     */
    public String getFinancialReportingSortCode() {
        return financialReportingSortCode;
    }

    /**
     * This method...
     * 
     * @param financialReportingSortCode
     */
    public void setFinancialReportingSortCode(String financialReportingSortCode) {
        this.financialReportingSortCode = financialReportingSortCode;
    }

    /**
     * Gets the fundGroupBudgetAdjustmentRestrictionLevelCode attribute.
     * 
     * @return Returns the fundGroupBudgetAdjustmentRestrictionLevelCode.
     */
    public String getFundGroupBudgetAdjustmentRestrictionLevelCode() {
        return fundGroupBudgetAdjustmentRestrictionLevelCode;
    }

    /**
     * Sets the fundGroupBudgetAdjustmentRestrictionLevelCode attribute value.
     * 
     * @param fundGroupBudgetAdjustmentRestrictionLevelCode The fundGroupBudgetAdjustmentRestrictionLevelCode to set.
     */
    public void setFundGroupBudgetAdjustmentRestrictionLevelCode(String fundGroupBudgetAdjustmentRestrictionLevelCode) {
        this.fundGroupBudgetAdjustmentRestrictionLevelCode = fundGroupBudgetAdjustmentRestrictionLevelCode;
    }
}

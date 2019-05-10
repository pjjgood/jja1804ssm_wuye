package com.ssm.wuye.dao;

import com.ssm.wuye.domain.PayCharge;
import com.ssm.wuye.domain.PayChargeExample.Criteria;
import com.ssm.wuye.domain.PayChargeExample.Criterion;
import com.ssm.wuye.domain.PayChargeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PayChargeSqlProvider {

    public String countByExample(PayChargeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pay_charge");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PayChargeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pay_charge");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PayCharge record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pay_charge");
        
        if (record.getPayid() != null) {
            sql.VALUES("payId", "#{payid,jdbcType=INTEGER}");
        }
        
        if (record.getChargeid() != null) {
            sql.VALUES("chargeId", "#{chargeid,jdbcType=INTEGER}");
        }
        
        if (record.getChargestandard() != null) {
            sql.VALUES("chargeStandard", "#{chargestandard,jdbcType=DOUBLE}");
        }
        
        if (record.getLatepayment() != null) {
            sql.VALUES("Latepayment", "#{latepayment,jdbcType=DOUBLE}");
        }
        
        if (record.getPayreal() != null) {
            sql.VALUES("payReal", "#{payreal,jdbcType=DOUBLE}");
        }
        
        if (record.getPaybalance() != null) {
            sql.VALUES("payBalance", "#{paybalance,jdbcType=DOUBLE}");
        }
        
        if (record.getHouseid() != null) {
            sql.VALUES("houseId", "#{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getChargetime() != null) {
            sql.VALUES("chargeTime", "#{chargetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayname() != null) {
            sql.VALUES("payName", "#{payname,jdbcType=VARCHAR}");
        }
        
        if (record.getPaystate() != null) {
            sql.VALUES("payState", "#{paystate,jdbcType=INTEGER}");
        }
        
        if (record.getPaymonth() != null) {
            sql.VALUES("payMonth", "#{paymonth,jdbcType=VARCHAR}");
        }
        
        if (record.getOwerid() != null) {
            sql.VALUES("owerId", "#{owerid,jdbcType=INTEGER}");
        }
        
        if (record.getChargename() != null) {
            sql.VALUES("chargeName", "#{chargename,jdbcType=VARCHAR}");
        }
        
        if (record.getChargeyear() != null) {
            sql.VALUES("chargeYear", "#{chargeyear,jdbcType=VARCHAR}");
        }
        
        if (record.getCs() != null) {
            sql.VALUES("cs", "#{cs,jdbcType=DOUBLE}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PayChargeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("payId");
        } else {
            sql.SELECT("payId");
        }
        sql.SELECT("chargeId");
        sql.SELECT("chargeStandard");
        sql.SELECT("Latepayment");
        sql.SELECT("payReal");
        sql.SELECT("payBalance");
        sql.SELECT("houseId");
        sql.SELECT("chargeTime");
        sql.SELECT("payName");
        sql.SELECT("payState");
        sql.SELECT("payMonth");
        sql.SELECT("owerId");
        sql.SELECT("chargeName");
        sql.SELECT("chargeYear");
        sql.SELECT("cs");
        sql.FROM("pay_charge");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PayCharge record = (PayCharge) parameter.get("record");
        PayChargeExample example = (PayChargeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pay_charge");
        
        if (record.getPayid() != null) {
            sql.SET("payId = #{record.payid,jdbcType=INTEGER}");
        }
        
        if (record.getChargeid() != null) {
            sql.SET("chargeId = #{record.chargeid,jdbcType=INTEGER}");
        }
        
        if (record.getChargestandard() != null) {
            sql.SET("chargeStandard = #{record.chargestandard,jdbcType=DOUBLE}");
        }
        
        if (record.getLatepayment() != null) {
            sql.SET("Latepayment = #{record.latepayment,jdbcType=DOUBLE}");
        }
        
        if (record.getPayreal() != null) {
            sql.SET("payReal = #{record.payreal,jdbcType=DOUBLE}");
        }
        
        if (record.getPaybalance() != null) {
            sql.SET("payBalance = #{record.paybalance,jdbcType=DOUBLE}");
        }
        
        if (record.getHouseid() != null) {
            sql.SET("houseId = #{record.houseid,jdbcType=INTEGER}");
        }
        
        if (record.getChargetime() != null) {
            sql.SET("chargeTime = #{record.chargetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayname() != null) {
            sql.SET("payName = #{record.payname,jdbcType=VARCHAR}");
        }
        
        if (record.getPaystate() != null) {
            sql.SET("payState = #{record.paystate,jdbcType=INTEGER}");
        }
        
        if (record.getPaymonth() != null) {
            sql.SET("payMonth = #{record.paymonth,jdbcType=VARCHAR}");
        }
        
        if (record.getOwerid() != null) {
            sql.SET("owerId = #{record.owerid,jdbcType=INTEGER}");
        }
        
        if (record.getChargename() != null) {
            sql.SET("chargeName = #{record.chargename,jdbcType=VARCHAR}");
        }
        
        if (record.getChargeyear() != null) {
            sql.SET("chargeYear = #{record.chargeyear,jdbcType=VARCHAR}");
        }
        
        if (record.getCs() != null) {
            sql.SET("cs = #{record.cs,jdbcType=DOUBLE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pay_charge");
        
        sql.SET("payId = #{record.payid,jdbcType=INTEGER}");
        sql.SET("chargeId = #{record.chargeid,jdbcType=INTEGER}");
        sql.SET("chargeStandard = #{record.chargestandard,jdbcType=DOUBLE}");
        sql.SET("Latepayment = #{record.latepayment,jdbcType=DOUBLE}");
        sql.SET("payReal = #{record.payreal,jdbcType=DOUBLE}");
        sql.SET("payBalance = #{record.paybalance,jdbcType=DOUBLE}");
        sql.SET("houseId = #{record.houseid,jdbcType=INTEGER}");
        sql.SET("chargeTime = #{record.chargetime,jdbcType=TIMESTAMP}");
        sql.SET("payName = #{record.payname,jdbcType=VARCHAR}");
        sql.SET("payState = #{record.paystate,jdbcType=INTEGER}");
        sql.SET("payMonth = #{record.paymonth,jdbcType=VARCHAR}");
        sql.SET("owerId = #{record.owerid,jdbcType=INTEGER}");
        sql.SET("chargeName = #{record.chargename,jdbcType=VARCHAR}");
        sql.SET("chargeYear = #{record.chargeyear,jdbcType=VARCHAR}");
        sql.SET("cs = #{record.cs,jdbcType=DOUBLE}");
        
        PayChargeExample example = (PayChargeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PayChargeExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}
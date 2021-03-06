package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Activity;
import com.ssm.wuye.domain.ActivityExample;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class ActivitySqlProvider {

    public String countByExample(ActivityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("activity");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ActivityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("activity");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Activity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("activity");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getActivityname() != null) {
            sql.VALUES("activityname", "#{activityname,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitydesc() != null) {
            sql.VALUES("activitydesc", "#{activitydesc,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitycont() != null) {
            sql.VALUES("activitycont", "#{activitycont,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitytime() != null) {
            sql.VALUES("activitytime", "#{activitytime,jdbcType=DATE}");
        }
        
        if (record.getActivityworker() != null) {
            sql.VALUES("activityworker", "#{activityworker,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityward() != null) {
            sql.VALUES("activityward", "#{activityward,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ActivityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("activityname");
        sql.SELECT("activitydesc");
        sql.SELECT("activitycont");
        sql.SELECT("activitytime");
        sql.SELECT("activityworker");
        sql.SELECT("activityward");
        sql.FROM("activity");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Activity record = (Activity) parameter.get("record");
        ActivityExample example = (ActivityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("activity");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getActivityname() != null) {
            sql.SET("activityname = #{record.activityname,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitydesc() != null) {
            sql.SET("activitydesc = #{record.activitydesc,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitycont() != null) {
            sql.SET("activitycont = #{record.activitycont,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitytime() != null) {
            sql.SET("activitytime = #{record.activitytime,jdbcType=DATE}");
        }
        
        if (record.getActivityworker() != null) {
            sql.SET("activityworker = #{record.activityworker,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityward() != null) {
            sql.SET("activityward = #{record.activityward,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("activity");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("activityname = #{record.activityname,jdbcType=VARCHAR}");
        sql.SET("activitydesc = #{record.activitydesc,jdbcType=VARCHAR}");
        sql.SET("activitycont = #{record.activitycont,jdbcType=VARCHAR}");
        sql.SET("activitytime = #{record.activitytime,jdbcType=DATE}");
        sql.SET("activityworker = #{record.activityworker,jdbcType=VARCHAR}");
        sql.SET("activityward = #{record.activityward,jdbcType=VARCHAR}");
        
        ActivityExample example = (ActivityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Activity record) {
        SQL sql = new SQL();
        sql.UPDATE("activity");
        
        if (record.getActivityname() != null) {
            sql.SET("activityname = #{activityname,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitydesc() != null) {
            sql.SET("activitydesc = #{activitydesc,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitycont() != null) {
            sql.SET("activitycont = #{activitycont,jdbcType=VARCHAR}");
        }
        
        if (record.getActivitytime() != null) {
            sql.SET("activitytime = #{activitytime,jdbcType=DATE}");
        }
        
        if (record.getActivityworker() != null) {
            sql.SET("activityworker = #{activityworker,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityward() != null) {
            sql.SET("activityward = #{activityward,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ActivityExample example, boolean includeExamplePhrase) {
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
        List<ActivityExample.Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            ActivityExample.Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<ActivityExample.Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    ActivityExample.Criterion criterion = criterions.get(j);
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
package com.ssm.wuye.dao;

import com.ssm.wuye.domain.SysOfVo;
import com.ssm.wuye.domain.SysOfVoExample.Criteria;
import com.ssm.wuye.domain.SysOfVoExample.Criterion;
import com.ssm.wuye.domain.SysOfVoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SysOfVoSqlProvider {

    public String countByExample(SysOfVoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sys_of_vo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SysOfVoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("sys_of_vo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SysOfVo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_of_vo");
        
        if (record.getOfid() != null) {
            sql.VALUES("ofId", "#{ofid,jdbcType=INTEGER}");
        }
        
        if (record.getOfname() != null) {
            sql.VALUES("ofName", "#{ofname,jdbcType=VARCHAR}");
        }
        
        if (record.getOfsex() != null) {
            sql.VALUES("ofSex", "#{ofsex,jdbcType=VARCHAR}");
        }
        
        if (record.getOfhomeplace() != null) {
            sql.VALUES("ofHomeplace", "#{ofhomeplace,jdbcType=VARCHAR}");
        }
        
        if (record.getOftel() != null) {
            sql.VALUES("ofTel", "#{oftel,jdbcType=VARCHAR}");
        }
        
        if (record.getOfnexus() != null) {
            sql.VALUES("ofNexus", "#{ofnexus,jdbcType=VARCHAR}");
        }
        
        if (record.getOlname() != null) {
            sql.VALUES("olName", "#{olname,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SysOfVoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ofId");
        } else {
            sql.SELECT("ofId");
        }
        sql.SELECT("ofName");
        sql.SELECT("ofSex");
        sql.SELECT("ofHomeplace");
        sql.SELECT("ofTel");
        sql.SELECT("ofNexus");
        sql.SELECT("olName");
        sql.FROM("sys_of_vo");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysOfVo record = (SysOfVo) parameter.get("record");
        SysOfVoExample example = (SysOfVoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sys_of_vo");
        
        if (record.getOfid() != null) {
            sql.SET("ofId = #{record.ofid,jdbcType=INTEGER}");
        }
        
        if (record.getOfname() != null) {
            sql.SET("ofName = #{record.ofname,jdbcType=VARCHAR}");
        }
        
        if (record.getOfsex() != null) {
            sql.SET("ofSex = #{record.ofsex,jdbcType=VARCHAR}");
        }
        
        if (record.getOfhomeplace() != null) {
            sql.SET("ofHomeplace = #{record.ofhomeplace,jdbcType=VARCHAR}");
        }
        
        if (record.getOftel() != null) {
            sql.SET("ofTel = #{record.oftel,jdbcType=VARCHAR}");
        }
        
        if (record.getOfnexus() != null) {
            sql.SET("ofNexus = #{record.ofnexus,jdbcType=VARCHAR}");
        }
        
        if (record.getOlname() != null) {
            sql.SET("olName = #{record.olname,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sys_of_vo");
        
        sql.SET("ofId = #{record.ofid,jdbcType=INTEGER}");
        sql.SET("ofName = #{record.ofname,jdbcType=VARCHAR}");
        sql.SET("ofSex = #{record.ofsex,jdbcType=VARCHAR}");
        sql.SET("ofHomeplace = #{record.ofhomeplace,jdbcType=VARCHAR}");
        sql.SET("ofTel = #{record.oftel,jdbcType=VARCHAR}");
        sql.SET("ofNexus = #{record.ofnexus,jdbcType=VARCHAR}");
        sql.SET("olName = #{record.olname,jdbcType=VARCHAR}");
        
        SysOfVoExample example = (SysOfVoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SysOfVoExample example, boolean includeExamplePhrase) {
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
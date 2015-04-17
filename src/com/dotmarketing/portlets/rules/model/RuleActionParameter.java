package com.dotmarketing.portlets.rules.model;

import com.dotcms.repackage.org.codehaus.jackson.annotate.JsonIgnore;
import com.dotmarketing.util.UtilMethods;

import java.io.Serializable;


public class RuleActionParameter implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String ruleActionId;
	private String key;
	private String value;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRuleActionId() {
		return ruleActionId;
	}
	public void setRuleActionId(String ruleActionId) {
		this.ruleActionId = ruleActionId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		if(UtilMethods.isSet(value)){
			return value;
		}
		else{
			return null;
		}
	}
	public void setValue(String value) {
		this.value = value;
	}
	@JsonIgnore
	public boolean isNew(){
		return !UtilMethods.isSet(id);
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj ==null || ! (obj instanceof RuleActionParameter)) return false;
		return ((RuleActionParameter)obj).getId().equals(this.getId());
	}
}

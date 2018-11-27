package com.learn.springioc.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionBean {

    private Properties properties;

    private List list;

    private Map map;

    private Map<String, Float> typemap;

    public Properties getProperties() {
	return properties;
    }

    public void setProperties(Properties properties) {
	this.properties = properties;
    }

    public List getList() {
	return list;
    }

    public void setList(List list) {
	this.list = list;
    }

    public Map getMap() {
	return map;
    }

    public void setMap(Map map) {
	this.map = map;
    }

    public Map<String, Float> getTypemap() {
	return typemap;
    }

    public void setTypemap(Map<String, Float> typemap) {
	this.typemap = typemap;
    }

}

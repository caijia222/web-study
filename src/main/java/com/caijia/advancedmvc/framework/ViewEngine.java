package com.caijia.advancedmvc.framework;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class ViewEngine {
    public void render(ModelAndView mv, Writer writer) throws IOException {
        String view = mv.view;
        Map<String, Object> model = mv.model;
        // 根据view找到模板文件:
        Template template = getTemplateByPath(view);
        // 渲染并写入Writer:
        template.write(writer, model);
    }
}

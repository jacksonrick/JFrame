package com.jf.page;

import com.github.pagehelper.PageInfo;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * 分页标签处理类
 * <p>使用bootstrap样式</p>
 *
 * @author rick
 * @version 1.1
 */
public class PaginationTag extends SimpleTagSupport {

    // 分页数据
    private PageInfo page;
    // 查询表单id
    private String queryForm = "queryForm";

    public void doTag() throws JspException, IOException {
        JspContext ctx = getJspContext();
        JspWriter out = ctx.getOut();
        out.print(DoTag.tag(page, queryForm));
    }

    public PageInfo getPage() {
        return page;
    }

    public void setPage(PageInfo page) {
        this.page = page;
    }

    public String getQueryForm() {
        return queryForm;
    }

    public void setQueryForm(String queryForm) {
        this.queryForm = queryForm;
    }

}

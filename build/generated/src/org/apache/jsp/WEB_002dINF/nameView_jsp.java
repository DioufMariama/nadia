package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nameView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_bind_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_nestedPath_path;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_bind_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_nestedPath_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_bind_path.release();
    _jspx_tagPool_spring_nestedPath_path.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   \n");
      out.write("      ");
      //  spring:nestedPath
      org.springframework.web.servlet.tags.NestedPathTag _jspx_th_spring_nestedPath_0 = (org.springframework.web.servlet.tags.NestedPathTag) _jspx_tagPool_spring_nestedPath_path.get(org.springframework.web.servlet.tags.NestedPathTag.class);
      _jspx_th_spring_nestedPath_0.setPageContext(_jspx_page_context);
      _jspx_th_spring_nestedPath_0.setParent(null);
      _jspx_th_spring_nestedPath_0.setPath("name");
      int[] _jspx_push_body_count_spring_nestedPath_0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_nestedPath_0 = _jspx_th_spring_nestedPath_0.doStartTag();
        if (_jspx_eval_spring_nestedPath_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("    <form action=\"\" method=\"post\">\n");
            out.write("        Name:\n");
            out.write("        ");
            //  spring:bind
            org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
            _jspx_th_spring_bind_0.setPageContext(_jspx_page_context);
            _jspx_th_spring_bind_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_nestedPath_0);
            _jspx_th_spring_bind_0.setPath("value");
            int[] _jspx_push_body_count_spring_bind_0 = new int[] { 0 };
            try {
              int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
              if (_jspx_eval_spring_bind_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <input type=\"text\" name=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.expression}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\" value=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\">\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_spring_bind_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_spring_bind_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_bind_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_bind_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_bind_0.doFinally();
              _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_0);
            }
            out.write("\n");
            out.write("        <input type=\"submit\" value=\"OK\">\n");
            out.write("    </form>\n");
            int evalDoAfterBody = _jspx_th_spring_nestedPath_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_nestedPath_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_nestedPath_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_nestedPath_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_nestedPath_0.doFinally();
        _jspx_tagPool_spring_nestedPath_path.reuse(_jspx_th_spring_nestedPath_0);
      }
      out.write("\n");
      out.write("  \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

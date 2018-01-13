<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PageContext</title>
</head>
<body>
    <%
        //代理域
        //使用PageContext,可以向其它域中设置属性

        //给request域设置域属性
        pageContext.setAttribute("game","Page",PageContext.PAGE_SCOPE);
        pageContext.setAttribute("game","Request",PageContext.REQUEST_SCOPE);
        pageContext.setAttribute("game","Session",PageContext.SESSION_SCOPE);
        pageContext.setAttribute("game","Application",PageContext.APPLICATION_SCOPE);

        //全域查找:
//        Object game = pageContext.getAttribute("game",PageContext.REQUEST_SCOPE);

        //这里会去pageContext里面找属性名为game的属性
//        Object game = pageContext.getAttribute("game");

        Object game = pageContext.findAttribute("game");

        out.write(game.toString());

    %>


</body>
</html>

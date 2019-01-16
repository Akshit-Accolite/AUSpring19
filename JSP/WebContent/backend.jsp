<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.lang.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<%! 
		int count =0,num=0;
		Integer xx;
		public void init(){
			count=1;
		}
	%>

	<%
		String oo =(String)pageContext.getAttribute("login",PageContext.APPLICATION_SCOPE);
		if(oo == "old"){
			xx = (Integer) pageContext.getAttribute(request.getParameter("username"), PageContext.APPLICATION_SCOPE);
			num = xx;
		}
		if(count==1 && (oo=="new"))
		{
			Integer x = (Integer) pageContext.getAttribute(request.getParameter("username"), PageContext.APPLICATION_SCOPE);
			if(x==null){
				x = 1;
			}else{
				x = x + 1;
			}
			pageContext.setAttribute("login","old",PageContext.APPLICATION_SCOPE);
			count++;
			num = x;
			pageContext.setAttribute(request.getParameter("username"),x,PageContext.APPLICATION_SCOPE);
		}
		out.print(num + "Number of times user " + request.getParameter("username"));	
	%>
</body>
</html>
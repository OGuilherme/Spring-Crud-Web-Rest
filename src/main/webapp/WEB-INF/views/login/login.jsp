<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;">
	<title>Spring Crud</title>

	<!--STYLESHEET-->
    <!--=================================================-->
    <!--Open Sans Font [ OPTIONAL ]-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'/>

    <!--Bootstrap Stylesheet [ REQUIRED ]-->
    <link type='text/css' href='<c:url value="/static/css/bootstrap.min.css"/>' rel="stylesheet"/>

    <!--Nifty Stylesheet [ REQUIRED ]-->
    <link type='text/css' href="<c:url value='/static/css/nifty.min.css'/>" rel="stylesheet"/>
    
    <link type='text/css' href='<c:url value="/static/plugins/ionicons/css/ionicons.min.css"/>' rel="stylesheet"/>
    
    <!--Bootstrap Validator [ OPTIONAL ]-->
    <link type='text/css' href='<c:url value="/static/plugins/bootstrap-validator/bootstrapValidator.min.css"/>' rel="stylesheet"/>
    
    <!--jQuery [ REQUIRED ]-->
    <script type='text/javascript' src='<c:url value="/static/js/jquery.min.js"/>'></script>
    
    <!--Bootstrap Validator [ OPTIONAL ]-->
    <script type='text/javascript' src='<c:url value="/static/plugins/bootstrap-validator/bootstrapValidator.min.js"/>'></script>
    <script type='text/javascript' src='<c:url value="/static/js/custom/login.js"/>'></script>

</head>
<body>
	<div class="cls-container">
		<!-- LOGIN FORM -->
		<!--===================================================-->
		<div class="cls-content">
		    <div class="cls-content-sm panel">
	            <div class="pad-btm">
	            	<h2>Spring Crud</h2>
	            </div>
	            <form action='<c:url value="/login"/>' method="post" id="bv-form">
					<div class="panel">
						<div class="">
							<h4 class="panel-title">Acessar</h4>
						</div>
						<div class="panel-body">
							<c:if test="${param.error != null}">
                                <div class="alert alert-danger">
                                    <p>Usuário ou senha inválidos. Por favor, digite novamente.</p>
                                </div>
                           	</c:if>
                           	<c:if test="${param.logout != null}">
                                <div class="alert alert-success">
                                    <p>Você foi desconectado com sucesso.</p>
                                </div>
                           	</c:if>
							<div class="form-group has-feedback">
								<i class="ion-person icon-lg form-control-feedback"></i>
				               	<input type="text" id="user" class="form-control" name="user" placeholder="Usuário" autofocus>
				            </div>
				            <div class="form-group has-feedback">
								<i class="ion-locked icon-lg form-control-feedback"></i>
				               	<input type="password" id="senha" class="form-control" name="senha" placeholder="Senha 	" autofocus>
				            </div>
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
							<div class="pad-top">
                               	<input type="submit"
                                   	class="btn btn-block btn-info btn-rounded" value="Acessar">
                           	</div>
						</div>
					</div>
					
	            </form>
		    </div>

		<!--===================================================-->
	</div>
	<!--===================================================-->
	<!-- END OF CONTAINER -->        
</body>
</html>
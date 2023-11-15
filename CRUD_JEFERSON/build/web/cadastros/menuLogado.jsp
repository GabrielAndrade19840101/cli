<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>M�dulo Cadastros</h1>
<h2>Menu Principal - Logado: ${sessionScope.nomeusuario} - ${sessionScope.tipousuario} - 
    <a href="${pageContext.request.contextPath}/UsuarioDeslogar">Sair do Sistema</a></h2>
<c:if test="${sessionScope.tipousuario == 'Administrador'}">
    <jsp:include page="menuAdministrador.jsp"/>
</c:if>
<c:if test="${sessionScope.tipousuario == 'Paciente'}">
    <jsp:include page="menuPaciente.jsp"/>
</c:if>
<c:if test="${sessionScope.tipousuario == 'Profsaude'}">
    <jsp:include page="menuProfsaude.jsp"/>
</c:if>

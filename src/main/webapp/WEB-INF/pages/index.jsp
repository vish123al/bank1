<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<table class="table table-striped">
		<caption>Client list</caption>
		<thead>
			<tr>
				<th>Last name</th>
				<th>First name</th>
				<th>Address</th>
				<th>Telephone</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="client" items="${listClient}">
				<tr>
					<td>${client.lastname}</td>
					<td>${client.firstname}</td>
					<td>${client.address}</td>
					<td>${client.telephone}</td>
					<td>Edit - Delete</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a type="button" class="btn btn-success" href="/add-client">Add client</a>
	</div>
</div>
<%@ include file="common/footer.jspf"%>
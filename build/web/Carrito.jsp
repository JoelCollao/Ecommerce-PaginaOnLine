

<%@page import="ModeloDAO.CarritoDAO"%>
<%@page import="Modelo.Carrito"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="Estilos/estilosindex.css"/>
       
        <title>Technology Networks</title>
    </head>
    <body>
       <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Technology Networks</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">

                <ul class="navbar-nav mr-auto">


                    <!-- para ver toda la lista de catalogos -->
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="Control?accion=home">Home<span class="sr-only">(current)</span></a>
                    </li>
                    
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="Control?accion=home">Seguir Comprando<span class="sr-only">(current)</span></a>
                    </li>
                   
                </ul>
                <div>        
                    <style type="text/css">
                        #logeo{
                            color: white;
                        }
                    </style>

                    <a id = "logeo" class="nav-link"><span class="sr-only">(current)</span>
                       
                    </a>
                </div>
                <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Sesión
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        
                        <a class="dropdown-item" href="Control?accion=login">Iniciar Sesion</a>
                        <a class="dropdown-item" href="Control?accion=registrarse">Registrarse</a>
                       
                        <a class="dropdown-item" href="Control?accion=logout">Cerrar Sesion</a>
                      
                        <a class="dropdown-item" href="Control?accion=ir_a_carrito">Ir al carrito</a>
                    </div>
                </div>
            </div>
        </nav>
        
        <div class="container mt-4">
            <h3>Listado de Carrito</h3>
            <div class="row">
                <div class="col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Item</th>
                                <th>Producto</th>
                                <th>Descripcion</th>
                                <th>Cantidad</th>
                                <th>Precio</th>
                                <th>Subtotal</th>
                                <th>Opcion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                
                CarritoDAO cDAO = new CarritoDAO();
                ArrayList<Carrito>listaCarrito= cDAO.listarCarrito();
                Carrito c;
                for(int i=0;i<listaCarrito.size();i++){
                    c= new Carrito();
                    c=listaCarrito.get(i);
                    %>
                            <tr>
                                <td><%= c.getItem() %></td>
                                <td><img src="ControladorImg?parametro=<%= c.getDescripcion_producto() %> " width="50" height="50"></td>
                                <td> <%= c.getDescripcion_producto() %></td>
                                <td> <%= c.getCantidad() %></td>
                                <td>  <%= c.getPrecio_unitario_producto() %></td>
                                <td><%= c.getSubtotal() %></td>
                                <td>
                                <a class="btn btn-warning">Quitar</a>
                                </td>
                            </tr>
                              <%}
            %>
                        </tbody>
                    </table>

                </div>
                <div class="col-sm-4">
                    <div clas="card">
                        <div class="card-header">
                            <h3>Generar Compra</h3>
                        </div>
                        <div class="card-body">
                            
                            <label>Subtotal:</label>
                            <input type="text" readonly="" class="form-control">
                            
                            <label>Descuento:</label>
                            <input type="text" readonly="" class="form-control">
                            
                            <label>Total a Pagar:</label>
                            <input type="text" readonly="" class="form-control">
                        
                        </div>
                        <div class="card-footer">
                            <a href="" class="btn btn-info btn-block">Realizar Pagó</a>
                            <a href="#" class="btn btn-danger btn-block">Generar Pagó</a>
                        </div>
                        
                        
                    </div> 
                </div>
            </div>
        </div>
                    
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
               
    </body>
</html>

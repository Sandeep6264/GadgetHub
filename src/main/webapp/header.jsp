<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/3258ae37c5.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="styles.css">
    <title>Document</title>
</head>

    <!--navbar 1 start here--> 
 
    <nav class="navbar navbar-expand-lg navbar-custom">
        <div class="container-fluid">
            <a href="index.jsp" class="navbar-brand">
                Gadget Hub
            </a>
            <button type="button" class="navbar-toggler" 
            data-bs-toggle="collapse" 
            data-bs-target="#mynav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="mynav" >
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                            Category
                        </a>
                        <ul class="dropdown-menu">
                            <li class="">
                                <a href="#" class="dropdown-item" >Speaker</a>
                            </li>
                            <li class="">
                                <a href="#" class="dropdown-item" >Cooler
                                    
                                </a>
                            </li>
                            <li class="">
                                <a href="#" class="dropdown-item" >TV</a>
                            </li>
                            <li class="">
                                <a href="#" class="dropdown-item" >Camera</a>
                            </li>
                            <li class="">
                                <a href="#" class="dropdown-item" >Laptop</a>
                            </li>
                            <li class="">
                                <a href="#" class="dropdown-item" >Fan</a>
                            </li>
                            <li class="">
                                <a href="#" class="dropdown-item" >Table</a>
                            </li>
                            <li class="">
                                <a href="#" class="dropdown-item" >Mobile</a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a href="index.jsp"  class="nav-link" >Products</a>
                    </li>
                    <li class="nav-item">
                        <a href="login.jsp"  class="nav-link" >Login</a>
                    </li>
                    <li class="nav-item">
                        <a href="register.jsp"  class="nav-link" >Register</a>
                    </li>

                </ul>

            </div>
        </div>
    </nav>
 
    <!--navbar 1 ends here--> 
 
    <br /><br /> 
 
    <!--admin navbar starts here--> 
 
    <nav class="navbar navbar-expand-lg navbar-custom"> 
      <div class="container-fluid"> 
        <a href="userHome.jsp" class="navbar-brand"> GadgetHub </a> 
 
        <button 
          type="button" 
          class="navbar-toggler" 
          data-bs-toggle="collapse" 
          data-bs-target="#mynav" 
        > 
          <span class="navbar-toggler-icon"></span> 
        </button> 
 
        <div class="collapse navbar-collapse" id="mynav"> 
          <ul class="navbar-nav ms-auto"> 
            <li class="nav-item"> 
              <a href="userHome.jsp" class="nav-link">Products</a> 
            </li> 
 
            <li class="nav-item dropdown"> 
              <a 
                href="#" 
                class="nav-link dropdown-toggle" 
                data-bs-toggle="dropdown" 
              > 
                Category 
              </a> 
              <ul class="dropdown-menu"> 
                <li> 
                  <a href="#" class="dropdown-item">Mobile</a> 
                </li> 
                <li> 
                  <a href="#" class="dropdown-item">TV</a> 
                </li> 
                <li> 
                  <a href="#" class="dropdown-item">Speaker</a> 
                </li> 
                <li>

Sca Project 2, [04-10-2024 21:30]
<a href="#" class="dropdown-item">Cooler</a> 
                </li> 
                <li> 
                  <a href="#" class="dropdown-item">Ipad</a> 
                </li> 
                <li> 
                  <a href="#" class="dropdown-item">Pixel</a> 
                </li> 
              </ul> 
            </li> 
 
            <li class="nav-item"> 
              <a href="adminStock.jsp" class="nav-link">Stocks</a> 
            </li> 
 
            <li class="nav-item"> 
              <a href="adminShipped.jsp" class="nav-link">Shipped</a> 
            </li> 
 
            <li class="nav-item"> 
              <a href="unshippedorders.jsp" class="nav-link">Orders</a> 
            </li> 
 
            <li class="nav-item dropdown"> 
              <a 
                href="#" 
                class="nav-link dropdown-toggle" 
                data-bs-toggle="dropdown" 
              > 
                Update items 
              </a> 
              <ul class="dropdown-menu"> 
                <li> 
                  <a href="#" class="dropdown-item">Add Products</a> 
                </li> 
                <li> 
                  <a href="#" class="dropdown-item">Remove Product</a> 
                </li> 
                <li> 
                  <a href="#" class="dropdown-item">Update Product</a> 
                </li> 
              </ul> 
            </li> 
 
            <li class="nav-item"> 
              <a href="#" class="nav-link">Logout</a> 
            </li> 
          </ul> 
        </div> 
      </div> 
    </nav> 
 
    <!--admin navbar ends here--> 
 
    <br /><br /> 
 
    <!--Customer Navbar start here--> 
    <nav class="navbar navbar-expand-lg navbar-custom"> 
      <div class="container-fluid"> 
        <a href="userHome.jsp" class="navbar-brand"> GadgetHub </a> 
 
        <button 
          type="button" 
          class="navbar-toggler" 
          data-bs-toggle="collapse" 
          data-bs-target="#mynav" 
        > 
          <span class="navbar-toggler-icon"></span> 
        </button> 
 
        <div class="collapse navbar-collapse" id="mynav"> 
          <ul class="navbar-nav ms-auto"> 
            <li class="nav-item"> 
              <a href="userHome.jsp" class="nav-link">Products</a> 
            </li> 
 
            <li class="nav-item"> 
              <a href="cartDetails.jsp" class="nav-link">Cart</a> 
            </li> 
 
            <li class="nav-item"> 
              <a href="cartDetails.jsp" class="nav-link"> 
                <i class="fa fa-cart-shopping" style="background-color: black;margin: 0;padding: 5px;"></i> 
              </a> 
            </li> 
 
            <li class="nav-item"> 
              <a href="#" class="nav-link">Orders</a> 
            </li> 
 
            <li class="nav-item"> 
              <a href="#" class="nav-link">Profile</a> 
            </li> 
 
            <li class="nav-item"> 
              <a href="#" class="nav-link">Logout</a> 
            </li> 
 
          </ul> 
        </div> 
      </div> 
    </nav> 
    <!--Customer Navbar ends here--> 
    
    <!-- Search Bar starts here  -->
     <div class="container-fluid  bg-warning text-center p-3 opacity-75">
        <h2>GadgetHub</h2>
        <p>We Specialize in Electronics</p>
        <form action="#">
            <div class="input-group ">
                <input type="text" class="form-control"  name="" id="" placeholder="Seach Items...." >
                <input type="submit" value="submit"  class="btn btn-primary" >
            </div>
        </form>
     </div>
    <script 
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
      crossorigin="anonymous" 
    ></script> 
  </body> 
</html>
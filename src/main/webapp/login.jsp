<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css">
</head>
  <body>

    <div class="container m-5 ">
        <div class="row justify-content-center">
            <form action="#" class="col-md-4 myform" >
                <div class="text-center mt-3">
                    <h2 class="text-primary">Login Form</h2>
                </div>
               <div class="row mt-2">
                <div class="col-md-12 form-group">
                    <label for="user-name">Username</label>
                    <input type="text" name="" id="user-name" class="form-control" placeholder="Enter Username" >
                </div>
               </div>
                <div class="row mt-2">
                    <div class="col-md-12 form-group">
                        <label for="password">Password</label>
                        <input type="password" name="" id="password" class="form-control" placeholder="Enter Password" >
                    </div>
                </div>
               <div class="row mt-2">
                <div class="col-md-12 form-group ">
                    <label for="loginAs">Login As</label>
                    <select name="" id="loginAs" class="form-select">
                        <option value="customer" selected>CUSTOMER</option>
                        <option value="admin">ADMIN</option>
                    </select>
                </div>
               </div>
                <div class="row mt-3 mb-3">
                    <div class="col-md-12 text-center  ">
                        <button type="submit" class="btn btn-primary">Login</button>
                     </div> 
                </div>

            
            </form>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/3258ae37c5.js" crossorigin="anonymous"></script>
  </head>
  <body>
  <jsp:include page="header.jsp"/>
    <div class="text-center text-primary mt-3 mb-3 h3">
          Cart Item 
    </div>
    <div class="container-fluid">
        <div class="table-responsive">
            <table class="table table-hover" >
                <thead>
                    <tr>
                        <th>Product Image</th>
                        <th>Product Name</th>
                        <th>Price</th>
                        <th>Qty</th>
                        <th>Add</th>
                        <th>Remove</th>
                        <th>Amount</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><img src="mobile.jpg" width="100px" height="100px" alt=""></td>
                        <td>IPhone</td>
                        <td>50000</td>
                      
                        <td>
                            <form action="#">
                                <input type="number" min="0">
                                <input type="hidden" name="" value="">
                            </form>
                        </td>
                        <td>
                            <a href="#"><i class="fa-solid fa-plus"></i></a>
                        </td>
                        <td>
                            <a href="#"><i class="fa-solid fa-minus"></i></a>
                        </td>
                        <td>50000</td>
                    </tr>
                    <tr>
                        <td colspan="6" class="text-center">
                            Total Amount in Rupees
                        </td>
                        <td colspan="2">
                            50000
                        </td>
                       
                    </tr>
                    <tr>
                        <td colspan="4" class="text-center">
                            <form action="#">
                                <button type="submit" class="btn btn-dark">Cancel</button>
                            </form>
                        </td>
                        <td colspan="3" class="text-center">
                            <form action="#">
                                <button type="submit" class="btn btn-warning">Pay Now</button>
                            </form>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
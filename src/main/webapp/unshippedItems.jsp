<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
    <div class="container-fluid mt-5 mb-5">
        <div class="table-responsive">
            <table class="table table-hover " >
                <thead>
                    <tr>
                        <th>Transaction Id</th>
                        <th>Product ID</th>
                        <th>User email id</th>
                        <th>Address</th>
                        <th>Qty</th>
                        <th>Status</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1234456</td>
                        <td><a href="#">32335323</a></td>
                        <td>sandeepmewada@gmail.com</td>
                        <td>Lalghati bhopal</td>
                        <td>5</td>
                     
                        <td class="text-primary">Ready to shop</td>
                        <td><a href="#" class="btn btn-warning" >Shop Now</a></td>
                    </tr>
                    <tr class="text-center">
                        <td colspan="7 ">
                            No Items Avaliable
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
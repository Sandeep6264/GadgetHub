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
  <jsp:include page="header.jsp" />
    <div class="container m-5">
        <div class="row justify-content-center ">
            <form action="" class="col-md-6 myform" >
                <div class="row mt-3 ">
                   <div class="form-group col-md-6">
                    <label for="product-name">Product Name</label>
                    <input type="text" name="" id="product-name " class="form-control" placeholder="Enter Product Name" >
                   </div>
                   <div class="form-group col-md-6">
                    <label for="product-type">Product Type</label>
                    <select name="" id="product-type" class="form-select">
                        <option value="mobile">Mobile</option>
                        <option value="tv">TV</option>
                        <option value="camera">Camera</option>
                        <option value="laptop">Laptop</option>
                    </select>
                   </div>

                </div>
                <div class="form-group mt-3">
                    <label for="product-desc">Product Description</label>
                    <textarea name="" id="product-desc" class="form-control" ></textarea>
                </div>
                <div class="row mt-3">
                    <div class="form-group col-md-6">
                        <label for="unit-price">Unit Price</label>
                        <input type="number" name="" id="unit-price" class="form-control" placeholder="Enter Product Unit" >
                    </div>
                    <div class="form-group col-md-6">
                        <label for="stock-qty">Stock Quantity</label>
                        <input type="number" name="" id="stock-qty" class="form-control" placeholder="Enter Product Quantity" >
                       </div>
                </div>
                <div class="form-group mt-3">
                    <label for="product-img">Product Image</label>
                    <input type="file" id="product-img" class="form-control">
                </div>
                <div class="row text-center mt-3 mb-3">
                    <div class="col-md-6">
                        <button type="reset" class="btn btn-danger">Reset</button>
                    </div>
                    <div class="col-md-6">
                        <button type="reset" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
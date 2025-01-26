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
  <jsp:include page="header.jsp"/>
    <div class="container mt-5 mb-5">
        <div class="row justify-content-center">
            <form action="#" class="col-md-4 myform">
                <div class="row mt-3">
                    <div class="col-md-12 form-group">
                        <label for="product-id">Product Id</label>
                        <input type="text" name="" id="product-id" class="form-control">
                    </div>
                    <div class="row mt-3 mb-3 text-center">
                        <div class="col-md-6">
                            <button type="reset" class="btn btn-danger">Cancel</button>
                        </div>
                        <div class="col-md-6">
                            <button type="submit" class="btn btn-primary">Remove</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
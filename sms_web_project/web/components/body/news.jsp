<%-- 
    Document   : news
    Created on : Apr 25, 2022, 7:56:06 PM
    Author     : Nawraj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/components/body/body.css" />
        <title>News</title>
    </head>
    <body>
        <div class="newsletter-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-xs-12 newsletter-column">
                        <div class="text">Sign up for Newsletter</div>
                    </div>
                    <div class="col-md-6 col-sm-6 col-xs-12 newsletter-column">
                        <div class="subscribe-form">
                            <form action="javascript:void(0)">
                                <input type="email" placeholder="Enter your email">
                                <button type="submit" class="btn-two">Subscribe</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

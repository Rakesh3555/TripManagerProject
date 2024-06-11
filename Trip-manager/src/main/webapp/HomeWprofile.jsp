<!DOCTYPE html>
<html lang="en">
<style>
    body {
        padding: 0;
        margin: 0;
    }

    img {
        height: 30%;
        width: 100%;
    }

    .video-background {
    
        width: 100%;
        height: 100%;
        overflow: hidden;
    }

    html {
        scroll-behavior: smooth;
    }


    #nav-bar {
        display: flex;
        width: 100%;
        justify-content: center;
        position: absolute;
        top: 235px;
    }

    #nav-bar ul {
        list-style: none;
        padding: 30px;
        width: 1000px;
        gap: 10px;
        display: flex;
        justify-content: space-between;
        border-radius: 40px;
        background-color: rgb(249, 249, 249);
        box-shadow: 0 5px 9px rgba(0, 0, 0, 0.1);

    }

    #nav-bar ul li a {
        text-decoration: none;
        color: #007BFF;
        font-weight: bold;
    }

    #nav-bar ul li a:hover {
        text-decoration: underline;
    }

    #bg-video {
        width: 100%;
        height: 100%;
        object-fit: cover;
    }

    #Trip-Packages {
        font-family: Arial, Helvetica, sans-serif;
        
    }

    .box {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
        gap: 10px;
        grid-auto-rows: minmax(100px, auto);

    }

    .bg-one {
       
        background-image: url(Images/International-package-home.jpg);
        background-size: cover;
    }

    .bg-two {
        
        background-image: url(Images/All\ India\ pack.jpg);
        background-size: cover;
    }

    #box2{
        grid-column: 2/4;
    }

    .bg-three {
        grid-column: 1/3;
        background-image: url(Images/Honeymoon.jpg);
        background-size: cover;
    }

    #box3{
        grid-column: 1/3;
    }

    .bg-four {
        
        background-image: url(Images/Wedding.jpg);
        background-size: cover;
    }

    .parent{
        margin: 10px;
        width: 96%;
        height: 290px;
        overflow: hidden;
        position: relative;
        display: inline-block;
        cursor: pointer;
        box-shadow: 0 4px 6px -1px rgba(0, 0, 0, 0.5) ;
        border-radius: 10px;
    }
    .child{
        height: 100%;
        width: 100%;
        background-size: cover;
        transition: all 1.1s;
    }
    .parent:hover .child{
        transform: scale(1.4);
    }
    .content1{
        position: absolute;
        top: 43%;
        left: 21%;
    }
    .content2{
        position: absolute;
        top: 44%;
        left: 39%;
    }
    .content3{
        position: absolute;
        top:44%;
        left:32%;
    }
    .content4{
        position: absolute;
        top: 44%;
        left: 25%;
    }
    #Button1{
        position: absolute;
        border: none;
        background-color: black;
        color: white;
        left: 34%;
    }

    .modal {
    display: none; 
    position: fixed; 
    z-index: 1; 
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    overflow: auto; 
    background-color: rgb(0,0,0); 
    background-color: rgba(0,0,0,0.4); 
}

.modal-content {
    background-color: #fefefe;
    margin: 15% auto; 
    padding: 20px;
    border: 1px solid #888;
    width: 80%;
    max-width: 400px; 
}

.close {
    color: #aaa;
    float: right;
    font-size: 28px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: black;
    text-decoration: none;
    cursor: pointer;
}

form {
    display: flex;
    flex-direction: column;
}

form label {
    margin-top: 10px;
}

form input {
    padding: 10px;
    margin-top: 5px;
    font-size: 16px;
}

form button {
    padding: 10px;
    margin-top: 20px;
    font-size: 16px;
    cursor: pointer;
}

    
</style>

<body>
    <div class="HomeTitlejpg">
        <img src="Images/HomeTitle.png" alt="">
    </div>
    <nav id="nav-bar">
        <ul>
            <li><a href="" style="text-decoration: none;">Profile</a></li>
            <li><a href="#section1" style="text-decoration: none;">Trip Packages</a></li>
            <li><a href="#section2" style="text-decoration: none;">Flight</a></li>
            <li><a href="#section3" style="text-decoration: none;">Hotels</a></li>
            <li><a href="#section4" style="text-decoration: none;">Insurance</a></li>
        </ul>
    </nav>


    <div class="video-background">
        <video autoplay muted loop id="bg-video">
            <source src="Videos/HomeVideo.mp4" type="video/mp4">

        </video>
    </div>

    <div id="section1">
        <h2>Our Packages</h2>
    </div>   

    <div class="box">
            <div class="parent">
                <div class="child bg-one">
                    <div class="content1">
                        <b style="font-size: 180%; color: white;">International Plans</b>
                        <div class="btn">
                            <button id="Button1" onclick="window.location.href='InternationalPackages.jsp'">7 Tours</button>
                        </div>
                    </div>
                </div>
            
            </div>
            <div class="parent" id="box2">
                <div class="child bg-two">
                    <div class="content2">
                        <b style="font-size: 180%; color: white">All India Plans</b>
                        <div class="btn">
                            <button id="Button1" onclick="window.location.href=''">3 Tours</button>
                        </div>
                    </div>
                </div>
             </div>
            <div class="parent" id="box3">
                <div class="child bg-three">
                    <div class="content3">
                        <b style="font-size: 180%; color: white">Honeymoon Plans</b>
                        <div class="btn">
                            <button id="Button1" onclick="window.location.href=''">6 Tours</button>
                        </div>
                    </div>
                </div>
             </div>
            <div class="parent">
                <div class="child bg-four">
                    <div class="content4">
                        <b style="font-size: 180%; color: white">Wedding Plans</b>
                        <div class="btn">
                            <button id="Button1" onclick="window.location.href=''">10 Tours</button>
                        </div>
                    </div>
             </div>

        </div>
    </div>

    <img src="Images/Experiance.png">

    


    <div id="section2">
        <h2>Section 2</h2>
        <p>This is the content of section 2.</p>
    </div>

    <div id="Hotels" class="section">
        <h2>Section 3</h2>
        <p>This is the content of section 3.</p>
    </div>

    <div id="Insurance" class="section">
        <h2>Section 4</h2>
        <p>This is the content of section 4.</p>
    </div>







</body>

</html>
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

  .angry-grid {
   display: grid; 
   grid-template-rows: 1fr 1fr 1fr 1fr;
   grid-template-columns: 1fr 1fr 1fr 1fr;
   
   gap: 10px;
   height: 100%;
   
}
  
#item-0 {
   
   height: 500px; 
   grid-row-start: 1;
   grid-column-start: 1;
  
   grid-row-end: 3;
   grid-column-end: 2;

}


#item-1 {

   
   height: 500px; 
   grid-row-start: 1;
   grid-column-start: 2;

   grid-row-end: 3;
   grid-column-end: 3;
   
}
#item-2 {

   
   grid-row-start: 1;
   grid-column-start: 3;
   /* object-fit: contain; */
   grid-row-end: 2;
   grid-column-end: 5;
   
}
#item-3 {

  
   grid-row-start: 2;
   grid-column-start: 3;

   grid-row-end: 3;
   grid-column-end: 5;
   
}
#item-4 {

   grid-row-start: 3;
   grid-column-start: 1;

   grid-row-end: 4;
   grid-column-end: 3;
   
}
#item-5 {

 
   grid-row-start: 3;
   grid-column-start: 3;

   grid-row-end: 4;
   grid-column-end: 5;
   
}
#item-6 {

   
   grid-row-start: 4;
   grid-column-start: 1;

   grid-row-end: 5;
   grid-column-end: 5;
   
}

*{
    margin: 0;
    padding: 0;
    font-family: 'Poppins', sans-serif; 
    box-sizing: border-box;
}

.wrapper{
    padding: 10px 10%;
}
#card-area{
    padding: 50px 0;
    margin-top: -40px;
}
.box-area{
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    grid-gap: 40px;
    margin-top: 50px;
}
.box {
	border-radius: 10px;
	position: relative;
	overflow: hidden;
	box-shadow: 5px 5px 15px rgba(0,0,0,0.9);
}
.box img{
    width: 100%;
    height: fit-content;
    border-radius: 10px;
    display: block;
    transition: transform 0.5s;
}
.overlay {
	width: 100%;
	height: 0;
	background: linear-gradient(transparent,#6262629f 58%);
	border-radius: 10px;
	position: absolute;
	left: 0;
	bottom: 0;
	overflow: hidden;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 40px;
	text-align: center;
	font-size: 14px;
	transition: height 0.5s;
}
.overlay h3 {
	font-weight: 500;
	margin-bottom: 5px;
	margin-top: 80%;
	font-family: 'Bebas Neue', sans-serif;
	font-size: 30px;
	letter-spacing: 5px;
}
.overlay a {
	margin-top: 10px;
	color: #262626;
	text-decoration: none;
	font-size: 14px;
	background: #fff;
	border-radius: 50px;
	text-align: center;
	padding: 4px 13px;
}
.box:hover img{
    transform: scale(1.1);
}
.box:hover .overlay{
    height: 100%;
}


  </style>
  <body>
    <div class="HomeTitlejpg">
      <img src="Images/HomeTitle.png" alt="">
  </div>
  <nav id="nav-bar">
      <ul>
          <li><a href="" style="text-decoration: none;" id="loginNav">Profile</a></li>
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
    <h1 style="text-align: center;margin-top: 60px;">International Packages</h1>
    <br>

    <!DOCTYPE html>

<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta content="IE=edge" http-equiv="X-UA-Compatible">
	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	<link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500&display=swap" rel="stylesheet">
	

    </head>
    <body>
	    <div id="card-area">
		    <div class="wrapper">
			    <div class="box-area">
				    <div class="box">
					    <img alt="" style="min-height: 68vh;" src="Images/Malasiya.jpg">
					    <div class="overlay">
						<h3 style="color: rgba(214,167,49,255);">MALASIYA</h3>
                        <a href="malasiyaPackages.jsp" style="margin-left: -5px;">Book Now</a>
					</div>
				</div>
				<div class="box">
					<img alt="" style="min-height: 68vh;" src="Images/Hong Kong.jpg">
					<div class="overlay">
						<h3 style="color: rgba(189,138,109,255)">HONG KONG</h3>
                        <a href="#" style="margin-left: -4px;">Book Now</a>
					</div>
				</div>
				<div class="box">
					<img alt="" style="min-height: 68vh;" src="Images/singapor1.jpg">
					<div class="overlay">
						<h3 style="color: violet;">SINGAPORE</h3>
			            <a href="#">Book Now</a>
					</div>
				</div>
                <div class="box">
					<img alt="" style="min-height: 68vh;" src="Images/australia.jpg">
					<div class="overlay">
						<h3 style="color: white;">AUSTRELIA</h3>
						<a href="#">Book Now</a>
					</div>
				</div>
                <div class="box">
					<img alt="" style="min-height: 68vh;" src="Images/Germany.jpg">
					<div class="overlay">
						<h3 style="color: rgba(168,47,92,255);">GERMANY</h3>
						<a href="#">Book Now</a>
					</div>
				</div>
                <div class="box">
					<img alt="" style="min-height: 68vh;" src="Images/dubai.jpg">
					<div class="overlay">
						<h3 style="color: #007BFF;">DUBAI</h3>
						<a href="#">Book Now</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

<!DOCTYPE html>
<html lang="en">


  <link rel="stylesheet" href="Malasiya.css ">

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
        <source src="Videos/MALAYSIA Cinematic.mp4" type="video/mp4">
      </video>
    </div>
    <h1 style="text-align: center;margin-top: 70px;">MALASIYA PACKAGES</h1>


    <div class="container">
      <div class="card__container">
         <article class="card__article">
            <img src="Images/Malasiya 1.jpg" alt="image" class="card__img">

            <div class="card__data">
               <span class="card__description" style="text-align: center;color: greenyellow;">FAMILY PACKAGE</span>
               <h2 class="card__title" style="text-align: center;">Sutable for travellers with kids</h2>
               <form action="MalaysiaPackageServlet" method="post">
                  <input type="hidden" name="action" value="familypackage">
                  <!-- <a href="" class="card__button" style="text-align: center; text-decoration: none;color: rgb(0, 128, 81);">ENQUIRE</a> -->
               		<input class="card__button" style="text-align: center; border:none; background-color:white; text-decoration: none;color: rgb(0, 128, 81);" type="submit" value="ENQUIRE" >
               </form>
            </div>
         </article>

         <article class="card__article">
            <img src="Images/malasyan frds.jpg" alt="image" class="card__img">

            <div class="card__data">
               <span class="card__description" style="text-align: center; color: rgb(237, 118, 75);">FRIENDS PACKAGE</span>
               <h2 class="card__title" style="text-align: center;">Sutable for friends and couples</h2>
               <form action="MalaysiaPackageServlet" method="post">
                  <input type="hidden" name="action" value="frindspackage">
                  <!-- <a href="" class="card__button" style="text-align: center;color: rgb(57, 223, 167);text-decoration: none;">ENQUIRE</a> -->
                  <input class="card__button" style="text-align: center;color: rgb(57, 223, 167);text-decoration: none; border:none;background-color: white;" type="submit" value="ENQUIRE">
               </form>

            </div>
         </article>
         
         <article class="card__article">
            <img src="Images/malasiyanight.jpg" alt="image" class="card__img">

            <div class="card__data">
               <span class="card__description" style="text-align: center;color: rgba(0, 0, 0, 0.297);">GROUP PACKAGE</span>
               <h2 class="card__title" style="text-align: center;">Sutable for group of travellers</h2>
               <form action="MalaysiaPackageServlet" method="post">
                  <input type="hidden" name="action" value="groupPackage">
                  <a href="" class="card__button" style="text-align: center;color: purple;text-decoration: none">ENQUIRE</a>
                  <input class="card__button" style="text-align: center;color: purple;text-decoration: none ; border: none ; background-color: white;" type="submit" value="ENQUIRE">
               </form>
              
            </div>
         </article>
      </div>
   </div>
    

  </body>
</html>
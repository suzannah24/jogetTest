(function() {
    function hideTheNavBar() {
      //searching
      const theNavBar = document.querySelector('.main-nav');
  
      if (theNavBar) {
        theNavBar.style.display = 'none';
        console.log("OK, I've hidden the navigation bar.");
      } else {
        console.error("Oops! I couldn't find the navigation bar.");
      }
    }
  
    //checking
    if (document.readyState === 'loading') {
      document.addEventListener('DOMContentLoaded', hideTheNavBar);
    } else {
      hideTheNavBar();
    }
  })();
  
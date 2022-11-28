
const menu = document.querySelector('#mobile-menu');
const menuLinks= document.querySelector('.navbar__menu');
const navbar__logo=document.querySelector('.navbar__logo')

//Display mobile-menu
const mobilemenu = () => {
    menu.classList.toggle('is-active');
    menuLinks.classList.toggle('active');
}

menu.addEventListener('click',mobilemenu)


const highlightMenu=()=>{
 const elem =document.querySelector('.highlight')
 const homeMenu=document.querySelector('#home-page')
 const aboutMenu=document.querySelector('#about-page')
 const servicesMenu=document.querySelector('#services-page')

 let scrollPos = window.scrollY

 if(window.innerWidth > 960 && scrollPos <600) {
    homeMenu.classList.add('hightlight')
    aboutMenu.classList.add('highlight')
    return
 }else if(window.innerWidth >960 && scrollPos <1400){
    aboutMenu.classList.add('highlight')
    homeMenu.classList.remove('hightlight')
    servicesMenu.classList.remove('hightlight')
    return
 }
 else if(window.innerWidth >960 && scrollPos <2345){
    aboutMenu.classList.remove('highlight')
    servicesMenu.classList.add('hightlight')
   
    return
 }
 if((elem && window.innerWidth <960 && scrollPos <600 )|| elem){
    elem.classList.remove('highlight')
 }
}
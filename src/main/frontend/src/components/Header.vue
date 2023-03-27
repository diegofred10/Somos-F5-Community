<script></script>
<template>
  <div class="header">
      <a href="/" aria-current="page" class="headerLogo"></a>
    <div class="menuContainer">
      <nav
        role="navigation"
        class="menuNav"
        style="transform: translateY(0px) translateX(0px)"
      >
        <a
          href="/misPublicaciones"
          aria-current="page"
          class="menuNavLink w--current"
          >Mis Publicaciones</a
        >
        <a href="/elMuro" class="menuNavLink">El Muro</a>
        <a href="/logOut" class="menuNavLink">logOut</a>
      </nav>

      <div
        class="menuMobile"
        style="-webkit-user-select: text"
        aria-label="manu"
        role="button"
        tabindex="0"
        aria-haspopup="menu"
        aria-expanded="true"
      >
        <div class="menuIcon">
          <div class="menuIconLine"></div>
          <div class="menuIconLine"></div>
        </div>
      </div>
    </div>
  </div>
</template>
<style lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/mixins" as m;

.header {
  position: fixed;
  left: 0%;
  top: 0%;
  right: 0%;
  bottom: 0%;
  display: flex;
  height: 5rem;
  -webkit-box-pack: center;
  justify-content: center;
  // -webkit-box-align: center;
  background-color: map-get(c.$colors, "light-orange");

  .headerLogo {
    background-image: url("https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bc9e1976ae0ada64b0_somos-f5.svg");
    background-size: contain;
    background-position: 0% 50%;
    background-repeat: no-repeat;
    width: 7rem;
    height: 2.5rem;
    margin: auto;
    margin-left: 1vw;
  }
  .menuContainer {
    display: flex;
    -webkit-box-pack: justify;
    justify-content: space-between;
    -webkit-box-align: center;
    flex: 1;


    .menuNav {
      display: flex;
      -webkit-box-align: center;
      align-items: center;
      grid-column-gap: 2rem;
      box-sizing: border-box;

      .menuNavLink {
        padding: 0.05rem 0px;
        font-family: "Open Sans";

        .menuNavLink w--current {
          border-bottom: 4px solid map-get(c.$colors, "orange");
          font-weight: 700;
        }
      }
    }
  }

  .menuMobile {
    position: relative float right;
    padding: 18px;
    font-size: 24px;
    cursor: pointer;
  }
}

// @media screen and (max-width: 991px)
// .menuContainer{
//     padding-right:1.5rem;
//     padding-left: 1.5rem;

// }
// .menuNavLink[data-collapse="medium"] .menuMobile{
//     display: block;
//         position: relative
//         float right;
//         padding: 18px;
//         font-size: 24px;
//         cursor: pointer;
// }
</style>

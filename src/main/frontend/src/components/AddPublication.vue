<script setup>
	import { ref } from "vue";
</script>

<template>
  <div class="formBody">
	<form>
    <h1 class="addYourPubli">¡Añade una nueva publicación!</h1>
		<input class="title"
			type=""
			name=""
			value=""
			placeholder="Título de tu publicación"
		/>
		<input class="description"
			type=""
			name=""
			value=""
			placeholder="Cuéntanos algo interesante..."
		/>
		<input class="resources"
			type=""
			name=""
			value=""
			placeholder="Sube archivos!"
		/>
    <div class="buttonsContainer">
    <button class="cancelButton">Cancelar</button>
    <button class="sendButton">Publicar</button>
  </div>
  <img class="purpleTriangle" src="../assets/images/imagesSomosF5/trianguloAzul 1.png" alt="Imagen de un triángulo color morado.">
  <img class="roseTriangle" src="../assets/images/imagesSomosF5/trianguloSalmon 2.png" alt="Imagen de un triángulo color salmón.">
  <img class="greenSplash" src="../assets/images/imagesSomosF5/manchaAzul 1.png" alt="Imagen de una mancha de agua color verde.">
  
	</form>
  </div>
</template>

<style lang="scss" scoped>
	@use "@/scss/colors" as c;

  form{
    width: 50em;
    padding: 1em;
    height: 35em;
    background: map-get(c.$colors, "orange");
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: space-around;

    input{
      width: 55%;
      border: 2px solid grey;
      background: white;
      font-weight: bold;
    }
    .addYourPubli{
  color: white;
  font-size: xx-large;
  font-weight: bold;
  }
  .description{
    height: 10em;
  }
  .buttonsContainer{
    display: flex;
    align-items: space-between;
    z-index: 2;
    

    .cancelButton{
      background-color: map-get(c.$colors, "light-purple");
      border-radius: 2%;
      color: map-get(c.$colors, "light-grayish");
      margin: 0 5em 0 0;
      

    }
    .sendButton{
      background-color: map-get(c.$colors, "purple");
      border-radius: 2%;
      color: map-get(c.$colors, "light-grayish");
      margin: 0 0 0 5em;
    }
  }
.purpleTriangle{
  position: absolute;
  bottom: 0;
  right: 1em;
  width: 9em;
}
.roseTriangle{
  position: absolute;
  bottom: 0;
  width: 30em;
  height: 6.5em;
  z-index: 1;

}
.greenSplash{
  position: absolute;
  bottom: 0;
  left: 0;
  width: 9em;
  
}

  }
  
</style>

<script setup>
	import { ref } from "vue";
</script>

<template>
	<form>
		<input
			type=""
			name=""
			value=""
			placeholder="placeholder1"
		/>
		<input
			type=""
			name=""
			value=""
			placeholder="placeholder2"
		/>
		<input
			type=""
			name=""
			value=""
			placeholder="placeholder3"
		/>
	</form>
</template>

<style lang="scss" scoped>
	@use "@/scss/colors" as c;

  form{
    padding: 1em;
    height: 10em;
    background: map-get(c.$colors, "orange");
    display: flex;
    flex-direction: column;
    align-items: space-around;
    justify-content: space-around;

    input{
      border: 1px solid black;
      background: white;
    }
  }
</style>

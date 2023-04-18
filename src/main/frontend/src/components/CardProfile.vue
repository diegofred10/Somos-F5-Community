<script setup>
import axios from 'axios';
import { defineProps } from 'vue';
let date = new Date().toLocaleDateString();
	window.addEventListener("DOMContentLoaded", () => {
		const buttonDelete = document.querySelector(".button-delete");
		const buttonEdit = document.querySelector(".button-edit");
		const title = document.querySelector(".titlePubli");
		const text = document.querySelector(".textPubli");

		buttonDelete.addEventListener("click", () => {
			const publicacion = buttonDelete.closest(".card");
			publicacion.remove();
		});

		buttonEdit.addEventListener("click", () => {
			title.contentEditable = true;
			text.contentEditable = true;
			buttonEdit.style.display = "none";
			const buttonSave = document.createElement("button");
			buttonSave.textContent = "Guardar";
			buttonSave.classList.add("button-save");
			buttonEdit.parentNode.insertBefore(
				buttonSave,
				buttonEdit.nextSibling
			);
			buttonSave.addEventListener("click", () => {
				title.contentEditable = false;
				text.contentEditable = false;
				buttonSave.parentNode.removeChild(buttonSave);
				buttonEdit.style.display = "block";
			});
		});
	});

	const props = defineProps({
		post: Object,

	})
	const deletePost = () => {
		const idPost = props.post.id;
		axios({
			method: "DELETE",
			url: "http://localhost:8080/api/posts/" + idPost,
			withCredentials: true,
		});
		location.reload()
	};
</script>

<template>
	<div class="cards">
		<div class="card">
			<div class="info">
				<div class="headerCard">
					<p class="date">{{ date }}</p>
				</div>
				<div class="publication">
					<div class="text">
						<h2 class="titlePubli">{{ post.title }}</h2>
						<p class="textPubli">
							{{ post.description }}
						</p>
						<p>Ver mas</p>
					</div>
					<img
						v-if="post.image"
						:src="'http://localhost:8080/media/' + post.image"
						alt="imagen post"
					/>
				</div>
				<div class="buttons">
					<button class="button-edit">
						<i class="fa-solid fa-pen btn btn-edit"></i>
					</button>
					<button class="button-delete">
						<i @click="deletePost" class="fa-solid fa-trash btn btn-delete"></i>
					</button>
				</div>
			</div>
		</div>
		<div class="separator">
			<img
				class="stripe"
				src="../assets/images/imagesSomosF5/franjaMorada 2.png"
				alt="Imagen de una franja morada."
			/>
		</div>
	</div>
</template>

<style lang="scss" scoped>
	@use "@/scss/colors" as c;
	@use "@/scss/fonts";
	
	.cards{
		width: 100%;
	}
	.card {
		// min-width: 100%;
		display: flex;
		// align-items: center;
		// justify-content: center;
		flex-direction: column;
		.info {
			display: flex;
			flex-direction: column;
			.headerCard {
				display: flex;
				justify-content: flex-end;
				align-items: flex-end;
				width: 100%;
			}
			.date {
				align-self: flex-end;
				color: map-get(c.$colors, "grey");
				font-family: "openSans";
			}
		}
		.publication {
			background-color: map-get(c.$colors, "white");
			border: 3px solid map-get(c.$colors, "grey");
			width: 100%;
			.titlePubli {
				padding: 0.5em;
				font-size: 1.5vw;
				color: map-get(c.$colors, "black");
				font-family: "openSans";
				font-weight: 600;
			}
			.textPubli {
				font-family: "openSans";
				padding: 0.5em;
			}
			img {
					width: 10%;
					&:active {
						width: 50%;
					}
				}
		}
	}

	.buttons {
		display: flex;
		align-items: center;
		justify-content: flex-end;

		.button-edit {
			background-color: map-get(c.$colors, "light-purple");
		}
		.button-delete {
			background-color: map-get(c.$colors, "light-purple");
		}
		button {
			margin: 0.3em;
			width: 2em;
			height: 2em;
			align-items: center;
			display: flex;
			justify-content: center;
			&:hover {
				opacity: 0.9;
				background-color: purple;
			}
		}
		.btn {
			font-size: 1em;
		}
	}

.separator{
  height: 5%;
			width: 20%;

}
		// .stripe {
		// 	width: 70vw;
    //   height: 10%;
		// }

</style>

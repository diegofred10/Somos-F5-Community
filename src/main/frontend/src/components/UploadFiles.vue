<template>
    <div>
    <input type="file" @change="onFileChange" ref="fileInput" style="display:none">
    <button @click="$refs.fileInput.click()">Select File</button>
    <button @click="uploadFile">Upload File</button>
    </div>
</template>

<script>
import axios from "axios";

export default {
    data() {
    return {
        file: null,
    };
    },
    methods: {
    onFileChange(e) {
        this.file = e.target.files[0];
    },
    uploadFile() {
        const formData = new FormData();
        formData.append("file", this.file);        
        axios.post("/uploads", formData, {
    headers: {
        'Content-Type': 'multipart/form-data'
    }
    })
    .then(response => {
        console.log(response);
        
    })
    .catch(error => {
        console.log(error);
    });
    },
    },
};
</script>


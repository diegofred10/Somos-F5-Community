import axios from "axios";
import { ref } from "vue";

export default class PostService {
    #post;
    #url = "http://localhost:8080/api/posts/"

    constructor() {
        this.post = ref([]);
    }
    async submitPost(postData) {
        try {
            axios({
                method: "POST",
                url: this.#url + "add",
                data: postData,
                withCredentials: true,

            }).then(response => {
                console.log(response)
            });
        
        } catch(error) {
        console.log(error);

    }
}
}
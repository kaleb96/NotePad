<template>
  <div class="header">
    <ul class="header-button-left">
        <li v-if="tabStatus != 0" @click="tabStatus = 0">Cancel</li>
    </ul>

    <ul class="header-button-right">
        <li v-if="tabStatus == 1" @click="tabStatus++">Next</li>
        <li v-if="tabStatus == 2" @click="publish">게시</li>   
    </ul>
    <img src="./assets/logo.png" class="logo" />
  </div>
  
  <Container :postdata="postdata" :tabStatus="tabStatus" :filterName = "filterName" :url="url" @write="textArea = $event"/>
  <button @click="more">더보기</button>

  <div class="footer" >
    <ul class="footer-button-plus" v-if="tabStatus == 0">
      <input @change="uploadImg" type="file" id="file" class="inputfile" />
      <label for="file" class="input-plus">+</label>
    </ul>
  </div>



</template>

<script>
import Container from './components/Container.vue';
import postdata from './assets/postingData.js';
import axios from 'axios'


export default {
  name: 'App',
  data() {
    return {
      postdata : postdata,
      checkCount : 1,
      tabStatus : 0,
      url : '',
      textArea : '',
      filterName : '',
    }
  },
  components: {
   Container,
  },
  methods : {
    more () {
      
      if(this.checkCount == 1) {

        axios.get('https://codingapple1.github.io/vue/more0.json')
        .then((result) => {
          // 요청 성공 시 실행될 메서드
            this.postdata.push(result.data);
            this.checkCount = 0;

        })
      } else if(this.checkCount == 0) {

        axios.get('https://codingapple1.github.io/vue/more1.json')
        .then((result) => {
          this.postdata.push(result.data);
          this.checkCount = 1;
        })
      }
    },

    uploadImg(e) {
      let file = e.target.files;
      
      // 이미지 업로드 후 이미지 필터링 페이지로 이동
      this.tabStatus = 1;
      this.url = URL.createObjectURL(file[0]);
      console.log("url = " + this.url);
    },

    publish() {
      var addPostData = {
        name : "kaleb",
        userImage : "https://placeimg.com/100/100/arch",
        postImage : this.url,
        likes: 32,
        data : "Dec 27",
        liked: false,
        content : this.textArea,
        filter : this.filterName
      };

      this.postdata.unshift(addPostData);
      this.tabStatus = 0;
    }


  },
  mounted() {
    this.emitter.on( "filterNameIs", (a) => {
      this.filterName = a;
    });
  }
}
  
</script>

<style>

body {
  margin: 0;
}

ul {
  padding: 5px;
  list-style-type: none;
}

.logo {
  width: 22px;
  margin: auto;
  display: block;
  position: absolute;
  left: 0;
  right: 0;
  top: 13px;
}

.header {
  width: 100%;
  height: 40px;
  background-color: white;
  padding-bottom: 8px;
  position: sticky;
  top: 0;
}

.header-button-left {
  color: skyblue;
  float: left;
  width: 50px;
  padding-left: 20px;
  cursor: pointer;
  margin-top: 10px;
}

.header-button-right {
  color: skyblue;
  float: right;
  width: 50px;
  cursor: pointer;
  margin-top: 10px;
}

.footer {
  width: 100%;
  position: sticky;
  bottom: 0;
  padding-bottom: 10px;
  background-color: white;
}

.footer-button-plus {
  width: 80px;
  margin: auto;
  text-align: center;
  cursor: pointer;
  font-size: 24px;
  padding-top: 12px;
}

.sample-box {
  width: 100%;
  height: 600px;
  background-color: bisque;
}

.inputfile {
  display: none;
}

.input-plus {
  cursor: pointer;
}

#app {
  box-sizing: border-box;
  font-family: "consolas";
  margin-top: 60px;
  width: 100%;
  max-width: 460px;
  margin: auto;
  position: relative;
  border-right: 1px solid #eee;
  border-left: 1px solid #eee;
}
</style>

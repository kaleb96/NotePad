import { createStore} from 'vuex'
import axios from 'axios'

const store = createStore({
    state() {
        return {
            likes : 0,
            likeState : false,
            more : {},
        }
    },

    mutations : {

        addLikes(state) {
            if(state.likeState == true) {
                state.likes--;
                state.likeState = false;
            } else {
                state.likes++;
                state.likeState = true;
            }
        },

        setMore(state, data) {
            state.more = data
        }
    },

    actions : {
        getData(context) {
            axios.get('https://codingapple1.github.io/vue/more0.json')
            .then((a) => {
                context.commit('setMore', a.data);
            })
        },
    },
})

export default store;

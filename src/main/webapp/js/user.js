new Vue({
    el: '#app',
    data: {
        user: {
            id: '',
            age: '',
            username: '',
            password: '',
            email: '',
            sex: ''
        },
        userList: []
    },
    methods: {
        findAll: function () {
            var _this = this;
            axios.get("/user/findAll").then(function (response) {
                _this.userList = response.data;
                console.log(response)
            }).catch(function (error) {
                console.log(error)
            })
        },
        findById: function (id) {
            var _this = this;
            axios.get("/user/findById?id=" + id).then(function (response) {
                _this.user = response.data;
                $('#myModal').modal('show')
            }).catch(function (error) {
                console.log(error)
            })
        },
        update: function (user) {
            var _this = this;
            axios.post("/user/update", _this.user).then(function (response) {
                _this.findAll();
            }).catch(function (error) {
                console.log(error)
            })
        }

    },
    created: function () {
        this.findAll();
    }
});
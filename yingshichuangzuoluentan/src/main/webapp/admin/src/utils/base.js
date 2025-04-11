const base = {
    get() {
        return {
            url : "http://localhost:8080/yingshichuangzuoluentan/",
            name: "yingshichuangzuoluentan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yingshichuangzuoluentan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "影视创作论坛"
        } 
    }
}
export default base

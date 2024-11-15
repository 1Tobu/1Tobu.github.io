import axios from 'axios'

const USER_API_BASE = 'http://localhost:8081/rym/users'

class UserService{
    getUsers(){
        return axios.get(USER_API_BASE);
    }
}

export default new UserService()
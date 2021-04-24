import http from '../http'

/** 接口 */
const Api = {
  page: '/sys/user/page',
  menu: '/sys/user/menu',
  power: '/sys/user/power',
  login: '/login',
  logout: '/logout'
}

/** 登录 */
export const login = data => {
  return http.request({
    url: Api.login,
    params: data,
    method: 'post'
  })
}

/** 注销 */
export const logout = data => {
  return http.request({
    url: Api.logout,
    data: data,
    method: 'post'
  })
}

/** 用户菜单 */
export const menu = data => {
  return http.request({
    url: Api.menu,
    data: data,
    method: 'get'
  })
}

/** 用户权限 */
export const power = data => {
  return http.request({
    url: Api.power,
    data: data,
    method: 'get'
  })
}

/** 用户列表 */
export const page = data => {
  return http.request({
    url: Api.page,
    params: data,
    method: 'get'
  })
}
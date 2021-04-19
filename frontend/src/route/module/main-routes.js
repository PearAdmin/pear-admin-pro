import Layout from "@/layout";

export default {
   Layout,
  'profile': () => import('@/view/profile/index.vue'),
  'dashboard-console': () => import('@/view/dashboard/console.vue'),
  'dashboard-workspace': () => import('@/view/dashboard/workspace.vue'),
  'result-success': () => import('@/view/result/success.vue'),
  'result-failure': () => import('@/view/result/failure.vue'),
  'error-403': () => import('@/view/error/403.vue'),
  'error-404': () => import('@/view/error/404.vue'),
  'error-500': () => import('@/view/error/500.vue'),
  'user': () => import('@/view/user/index.vue'),
  'role': () => import('@/view/role/index.vue'),
  'log-operate': () => import('@/view/log/operate.vue'),
  'log-login': () => import('@/view/log/login.vue'),
  'power': () => import('@/view/power/index.vue'),
  'config': () => import('@/view/config/index.vue'),
  'dict': () => import('@/view/dict/index.vue'),
  'post': () => import('@/view/post/index.vue'),
  'dept-list': () => import('@/view/dept/index.vue'),
  'server': () => import('@/view/server/index.vue'),
  'online': () => import('@/view/online/index.vue'),
  'redis': () => import('@/view/redis/index.vue'),
  'doc': () => import('@/view/doc/index.vue'),
  'mail': () => import('@/view/mail/index.vue'),
  'file': () => import('@/view/file/index.vue')
}

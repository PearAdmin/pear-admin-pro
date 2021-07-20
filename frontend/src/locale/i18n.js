import { nextTick } from 'vue'
import { createI18n } from 'vue-i18n'

export function setupI18n(options = { locale: 'en' }) {
  const i18n = createI18n(options)
  setI18nLanguage(i18n, options.locale)
  return i18n
}

export function setI18nLanguage(i18n, locale) {
  if (i18n.mode === 'legacy') {
    i18n.global.locale = locale
  } else {
    i18n.global.locale.value = locale
  }
  document.querySelector('html').setAttribute('lang', locale)
}

export async function loadLocaleMessages(i18n, locale) {
  // load locale messages with dynamic import
  const messages = await import(`./lang/${locale}.js`)
  // set locale and locale message
  i18n.global.setLocaleMessage(locale, messages.default)
  // set local
  setI18nLanguage(i18n, locale)
  return nextTick()
}

{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()}).replaceTrailingBrackets()}; csv('C:/FileBot/Formats/Shows/ShowFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}

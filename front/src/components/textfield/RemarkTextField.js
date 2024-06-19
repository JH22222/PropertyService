const { TextField } = require('@mui/material')

const RemarkTextField = ({ value, onChange, width = 1500, rows = 4, sx }) => {
  return (
    <TextField
      value={value}
      rows={rows} // 기본값은 4로 설정
      sx={{ width: width }} // 기본값은 500으로 설정
      onChange={onChange}
      label="특이사항"
      multiline
    />
  )
}

RemarkTextField.displayName = 'RemarkTextField'

export default RemarkTextField
